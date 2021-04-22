package com.hzt.myspring.aop;

import org.springframework.stereotype.Component;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName TestBean.java
 * @Description TODO
 * @createTime 2021年04月22日 11:07:00
 */
@Component
public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}
}
