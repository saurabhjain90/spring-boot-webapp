package com.sa.web;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class WebAppTest {

	private String INPUT = "13411";
	@Test
	public void testLength1() {
		Assert.assertEquals(INPUT,"13411");
	}


	@Test
	public void testWidth1() {
		Assert.assertEquals(INPUT,"13411");
	}
}
