package com.shu.main;

import com.shu.service.Function;
import com.shu.service.FunctionService;

public class main {
	public static void main(String[] args) {
		Function fu =new FunctionService().getFunctionPort();  
	    String str=fu.transWords("Let's Get Heck Out Of Here!");  
	    //最后str就是在Trans项目下的transWords方法处理后的字符串咯!  
	    System.out.println(str);
	}
}
