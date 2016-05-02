package com.ccbtrust.project.login.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ccbtrust.common.exception.ApplicationException;
import com.ccbtrust.ibatis.page.PageBean;
import com.ccbtrust.ibatis.support.EntityDaoImpl;
import com.ccbtrust.project.login.dao.IbatisTest;
@Repository
public class IbatisTestImpl extends EntityDaoImpl implements IbatisTest {

	@Override
	public int update(String s, Object obj) {
		return this.getDao().update(s, obj);
	}

	@Override
	public void txTest(Map<String, String> map1, Map<String, String> map2) {
		try{
			this.getDao().txBegin();
			this.getDao().save("IbatisSqlMap.insert", map1);
			this.getDao().update("IbatisSqlMap.update", map2);
			this.getDao().txCommit();
		}catch(ApplicationException e){
			throw e;
		}finally{			
			this.getDao().txEnd();
		}
		
	}

	@Override
	public List findTest(Map<String, String> map) {
		return this.getDao().find("IbatisSqlMap.find");
	}

	@Override
	public PageBean pageFindTest(PageBean pageBean, Map map) {
		this.getDao().find("IbatisSqlMap.find", pageBean, map);
		return pageBean;
	}

	
}
