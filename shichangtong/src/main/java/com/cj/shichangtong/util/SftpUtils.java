package com.cj.shichangtong.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SftpUtils {

	private static final Logger LogManager = LoggerFactory.getLogger(SftpUtils.class);

	protected String host;
	protected int port;
	protected String username;
	protected String password;

	/**
	 * @param host
	 *            ip
	 * @param port
	 *            端口
	 * @param username
	 *            账号
	 * @param password
	 *            密码
	 */
	public SftpUtils(String host, int port, String username, String password) {
		set(host, port, username, password);
	}

	public void set(String host, int port, String username, String password) {
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	Session sshSession = null;

	/**
	 * 链接linux
	 */
	public ChannelSftp connect() {
		ChannelSftp sftp = null;
		try {
			JSch jsch = new JSch();
			jsch.getSession(username, host, port);
			sshSession = jsch.getSession(username, host, port);
			sshSession.setPassword(password);
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");
			sshSession.setConfig(sshConfig);
			sshSession.connect();
			LogManager.info(String.format("%s connect success", host));
			Channel channel = sshSession.openChannel("sftp");
			channel.connect();
			sftp = (ChannelSftp) channel;
		} catch (Exception e) {
			LogManager.error("connect:" + host, e);
			close(null);
			return null;
		}
		return sftp;
	}

	/**
	 * linux上传文件
	 */
	public void upload(String directory, File file) {
		ChannelSftp sftp = connect();
		try {
			if (null != sftp) {
				sftp.cd(directory);
				LogManager.info(String.format("cd %s", directory));
				sftp.put(new FileInputStream(file), file.getName());
			}
		} catch (Exception e) {
			LogManager.error("upload:" + host, e);
		} finally {
			sftp.disconnect();
			sftp.exit();
			sshSession.disconnect();
		}
	}

	/**
	 * linux下载文件
	 */
	public void get(String directory, String downloadFile) {
		ChannelSftp sftp = connect();
		try {
			if (null != sftp) {
				File file = new File(directory);
				String parent = getParent(file);
				sftp.cd(parent);
				File desc = new File(downloadFile);
				// 判断文件夹是否存在，不存在则创建
				File parentFile = desc.getParentFile();
				if (!parentFile.exists()) {
					parentFile.mkdirs();
				}
				FileOutputStream outputStream = new FileOutputStream(desc);
				sftp.get(file.getName(), outputStream);
				LogManager.info(String.format("down %s suc", directory));
				outputStream.close();
			}
		} catch (Exception e) {
			LogManager.error("down error :" + directory, e);
		} finally {
			close(sftp);
		}
	}

	protected void close(ChannelSftp sftp) {
		if (sftp != null) {
			sftp.disconnect();
			sftp.exit();
		}
		if (sshSession != null) {
			sshSession.disconnect();
		}
	}

	protected String getParent(File desc) {
		String sysType = System.getProperty("os.name");
		if (!sysType.toUpperCase().equals("WINDOWS")) {
			String parent = desc.getParent();
			return parent.replace("\\", "/");
		}
		return desc.getParent();
	}

}
