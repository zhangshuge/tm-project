package com.ccbtrust.project.login.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ccbtrust.ibatis.ICommonDao;
import com.ccbtrust.ibatis.support.EntityDaoImpl;
import com.ccbtrust.project.login.dao.LoginDao;
@Repository
public class LoginDaoImpl extends EntityDaoImpl implements LoginDao{

	protected static final Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);
	@Override
	public void getLoginTest() {
		logger.debug("get login dao is go");
		ICommonDao dao = this.getDao();
		String contractId = "012";
		Object obj = dao.save("LoginSqlMap.insert_id",contractId);
		//logger.debug(obj.toString());
	}
	

}
