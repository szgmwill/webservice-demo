package com.will.webservice;

/**
 * 测试WebService
 * 
 * @author will
 * @version 1.0
 * @date
 */
public class MyService {

	/**
	 * say hello
	 * @param name
	 */
	public String sayHello(String name) {

		return "Hello, " + name;
	}

	/**
	 * 提供了一个做加法的服务
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		return a + b;
	}
}
