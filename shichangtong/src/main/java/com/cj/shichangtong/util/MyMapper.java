
package com.cj.shichangtong.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 * 
 * MyMapper
 * 
 * cody cody 2017年11月9日 上午10:08:00
 * 
 * @version 1.0.0
 *
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
	// TODO
	// FIXME 特别注意，该接口不能被扫描到，否则会出错
}
