package com.will.webservice;

public class TestClient {
	public static void main(String[] args) {
		try {
			// 创建客户端对象
			MyServiceStub wsStub = new MyServiceStub();

			// new一个调用sayHello方法需要的参数SayHello，并且设置name
			SayHello sayHello = new SayHello();
			sayHello.setName("Will");
			// 调用web服务
			SayHelloResponse sayHelloResponse = wsStub.sayHello(sayHello);
			// 拿到返回结果
			System.out.println(sayHelloResponse.get_return());

			Add add = new Add();
			add.setA(5);
			add.setB(3);
			AddResponse addResponse = wsStub.add(add);
			System.out.println(addResponse.get_return());
		} catch (Exception e) {
			System.out.println("error:"+e);
		}
		
	}
}
