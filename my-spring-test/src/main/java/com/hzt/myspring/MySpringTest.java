package com.hzt.myspring;

import com.hzt.myspring.aop.TestBean;
import com.hzt.myspring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringTest {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		//user bean = context.getBean(user.class);
		TestBean testBean = context.getBean(TestBean.class);
		testBean.test();
		//System.out.println(bean);
	}
}
