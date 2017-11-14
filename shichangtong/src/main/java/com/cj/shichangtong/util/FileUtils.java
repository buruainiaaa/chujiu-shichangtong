package com.cj.shichangtong.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 文件上传 下载工具类
 * 
 * FileUtils
 * 
 * cody cody 2017年11月14日 上午9:37:12
 * 
 * @version 1.0.0
 *
 */
public class FileUtils {
	/**
	 * 文件上传 handleFileUpload
	 * 
	 * @param request
	 * @param fileName
	 *            上传文件后 文件的完全限定名 void
	 * @exception @since
	 *                1.0.0
	 */
	public void handleFileUpload(HttpServletRequest request, String fileName) {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		MultipartFile file = null;
		BufferedOutputStream stream = null;
		for (int i = 0; i < files.size(); ++i) {
			file = files.get(i);
			if (!file.isEmpty()) {
				try {
					String uploadFilePath = file.getOriginalFilename();
					System.out.println("uploadFlePath:" + uploadFilePath);
					// 截取上传文件的文件名
					String uploadFileName = uploadFilePath.substring(uploadFilePath.lastIndexOf('\\') + 1,
							uploadFilePath.indexOf('.'));
					System.out.println("multiReq.getFile()" + uploadFileName);
					// 截取上传文件的后缀
					String uploadFileSuffix = uploadFilePath.substring(uploadFilePath.indexOf('.') + 1,
							uploadFilePath.length());
					System.out.println("uploadFileSuffix:" + uploadFileSuffix);
					// stream = new BufferedOutputStream(new FileOutputStream(
					// new File(".//uploadFiles//" + uploadFileName + "." +
					// uploadFileSuffix)));
					stream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
					byte[] bytes = file.getBytes();
					stream.write(bytes, 0, bytes.length);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (stream != null) {
							stream.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				System.out.println("上传文件为空");
			}
		}
		System.out.println("文件接受成功了");
	}

	/**
	 * 文件下载 download
	 * 
	 * @param res
	 * @param fileName
	 *            下载文件的地址 完全限定名 void
	 * @exception @since
	 *                1.0.0
	 */
	public void download(HttpServletResponse res, String fileName) {
		// String fileName = "upload.jpg";
		res.setHeader("content-type", "application/octet-stream");
		res.setContentType("application/octet-stream");
		res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		byte[] buff = new byte[1024];
		BufferedInputStream bis = null;
		OutputStream os = null;
		try {
			os = res.getOutputStream();
			// bis = new BufferedInputStream(new FileInputStream(new File("d://"
			// + fileName)));
			bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
			int i = bis.read(buff);
			while (i != -1) {
				os.write(buff, 0, buff.length);
				os.flush();
				i = bis.read(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("success");
	}

}
