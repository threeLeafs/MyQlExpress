package com.wpf.qlexpress.test;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

public class MyTest {

	public static void main(String[] args) {
		ExpressRunner runner = new ExpressRunner();
		DefaultContext<String, Object> context = new DefaultContext<String, Object>();
		context.put("a",1);
        context.put("b",2);
        context.put("c",4);
        String express = "a+b*c";
        try {
			Object r = runner.execute(express, context, null, true, false);
			System.out.println(r);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
