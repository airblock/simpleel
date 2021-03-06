package com.alibaba.simpleEL.bvt.dialect.tiny;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.simpleEL.dialect.tiny.TinyELEvalService;

public class FunctionTest_2 extends TestCase {
	public void test_method() throws Exception {
		TinyELEvalService service = new TinyELEvalService();

		service.regsiterVariant(String.class, "a", "b");

		Map<String, Object> ctx = new HashMap<String, Object>();
		ctx.put("a", "3");
		ctx.put("b", "4");

		Assert.assertEquals(7, service.eval(ctx, "Integer.parseInt(a) + Integer.parseInt(b)"));
		Assert.assertEquals(true, service.eval(ctx, "Integer.parseInt(a) < Integer.parseInt(b)"));
	}
}
