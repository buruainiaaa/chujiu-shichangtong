package com.cj.shichangtong.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterfaceLogUtil {

	private final  Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 public void helpMethod(){  
		 	logger.debug("This is a debug message");  
	        logger.info("This is an info message");  
	        logger.warn("This is a warn message");  
	        logger.error("This is an error message");  
	    }  
	 
	 public static void writeDebug(String message){
		 new InterfaceLogUtil().logger.debug(message);
	 }
	 
	 public static void writeInfo(String message){
		 new InterfaceLogUtil().logger.info(message);
	 }
	 
	 public static void writeWarn(String message){
		 new InterfaceLogUtil().logger.warn(message);
	 }
	 
	 public static void writeError(String message){
		 new InterfaceLogUtil().logger.error(message);
	 }
}
