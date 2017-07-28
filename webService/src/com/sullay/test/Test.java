package com.sullay.test;

import com.sullay.service.HelloWorld;
import com.sullay.service.HelloWorldService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld fu =new HelloWorldService().getHelloWorldPort();
	    fu.helloWorld();
	}

}
