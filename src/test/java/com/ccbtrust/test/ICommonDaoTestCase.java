package com.ccbtrust.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.ccbtrust.ibatis.page.PageBean;
import com.ccbtrust.project.login.dao.IbatisTest;
import com.ccbtrust.test.config.AbstractTests;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ICommonDaoTestCase extends AbstractTests {
	@Autowired
	IbatisTest ibatis;
	@Test
	public void txTest(){
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("seq", "0");
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("before", "0");
		map2.put("after", "1");
		ibatis.txTest(map1, map2);
	}
	@Test
	public void updateTest(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("before", "0");
		map.put("after", "1");
		int num = ibatis.update("LoginSqlMap.update", map);
		System.out.println(num);
	};
	@Test
	public void findTest(){
		List list = ibatis.findTest(null);
		System.out.println("------"+Arrays.toString(list.toArray()));
	}
	@Test
	public void pageFindTest(){
		PageBean pageBean = new PageBean();
		pageBean.setLength(2);
		PageBean p = ibatis.pageFindTest(pageBean, null);
		System.out.println(Arrays.toString(p.getRows().toArray()));;
	}
}
