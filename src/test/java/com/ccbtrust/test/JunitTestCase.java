package com.ccbtrust.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.ccbtrust.project.login.dao.LoginDao;
import com.ccbtrust.test.config.AbstractTests;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTestCase extends AbstractTests{
	@Autowired
	private LoginDao loginDao;
	/**
	 * 启动junit测试
	 */
	@Test
	public void junitTest(){
		logger.debug("junit is run success!");
		loginDao.getLoginTest();
	}
}
