package com.sullay.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class HelloWorld {
	
    public void helloWorld(){
    	System.out.println("hello world!!!");
    }  
  
    public static void main(String[] args) {
    	Endpoint.publish("http://localhost:9001/Service/HelloWorld",new HelloWorld());  
        System.out.println("Success~");  
    }
}
