package com.cj.shichangtong.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterfaceLogUtil {
	private InterfaceLogUtil() {
	}

	private static InterfaceLogUtil interfaceLogUtil = null;

	public static InterfaceLogUtil getInstance() {
		if (interfaceLogUtil == null) {
			interfaceLogUtil = new InterfaceLogUtil();
		}
		return interfaceLogUtil;
	}

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void helpMethod() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
	}

	public static void writeDebug(String message) {
		InterfaceLogUtil.getInstance().logger.debug(message);
	}

	public static void writeInfo(String message) {
		InterfaceLogUtil.getInstance().logger.info(message);
	}

	public static void writeWarn(String message) {
		InterfaceLogUtil.getInstance().logger.warn(message);
	}

	public static void writeError(String message) {
		InterfaceLogUtil.getInstance().logger.error(message);
	}
}
