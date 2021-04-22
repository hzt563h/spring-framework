package com.hzt.myspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName AspectJTest.java
 * @Description TODO
 * @createTime 2021年04月22日 11:07:00
 */
@Aspect
@Component
public class AspectJTest {
	/**
	 * 定义的切点
	 */
	@Pointcut("execution(public * com.hzt.myspring.aop..*.*(..))")
	public void test(){}

	/**
	 * 前置通知
	 */
	@Before("test()")
	public void beforeTest() {
		System.out.println("前置通知");
	}

	/**
	 * 后置通知
	 */
	@After("test()")
	public void after() {
		System.out.println("后置通知");
	}

	/**
	 * 环绕通知
	 * @param p
	 * @return
	 */
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.err.println("环绕通知业务处理前");
		Object o = null;
		try {
			// 处理
			o = p.proceed();
			System.out.println("方法调用完了？");
		} catch (Throwable a) {
			a.printStackTrace();
		}
		System.err.println("环绕通知业务处理后");
		return o;
	}
}
