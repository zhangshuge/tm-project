package com.ccbtrust.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.ccbtrust.test.config.AbstractTests;

public class AnnotationTestCase extends AbstractTests {
	@Autowired
	Environment environment;
	
	@Value("${db.type}")
	private String dbType;
	
	@Test
	public void environmentTest(){
		System.out.println(environment.getProperty("sql.map.config.file"));
		System.out.println(dbType);
	}
}
