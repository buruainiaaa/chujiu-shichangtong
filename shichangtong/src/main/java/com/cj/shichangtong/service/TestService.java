/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cj.shichangtong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.shichangtong.mapper.TestMapper;
import com.cj.shichangtong.model.Test;
import com.github.pagehelper.PageHelper;

/**
 * @author
 * @since
 */
@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;

	public List<Test> getAll(Test city) {
		if (city.getPage() != null && city.getRows() != null) {
			PageHelper.startPage(city.getPage(), city.getRows());
		}
		List<Test> testList = testMapper.selectAll();
		return testList;
	}

	public Test getById(Integer id) {
		return testMapper.selectByPrimaryKey(id);
	}

	public void deleteById(Integer id) {
		testMapper.deleteByPrimaryKey(id);
	}

	public void save(Test country) {
		if (country.getId() != null) {
			testMapper.updateByPrimaryKey(country);
		} else {
			testMapper.insert(country);
		}
	}
}
