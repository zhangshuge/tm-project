package com.ccbtrust.project.login.dao;

import java.util.List;
import java.util.Map;

import com.ccbtrust.ibatis.page.PageBean;


public interface IbatisTest {
	public int update(String s,Object obj);
	public void txTest(Map<String,String> map1,Map<String,String> map2);
	public List findTest(Map<String,String> map);
	public PageBean pageFindTest(PageBean pageBean,Map map);
}
