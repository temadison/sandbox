package org.tem.soap.ws;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Test;

public class HollaWorldImplTest {

	@Test
	public void test() throws MalformedURLException {
		HollaWorld hello = new HollaWorldImpl();

		String name = "mkyong";
		System.out.println(hello.getHollaWorldAsString(name));

		assertEquals("Values not equal", HollaWorldImpl.GREETING + name, hello.getHollaWorldAsString(name));
	}

}
