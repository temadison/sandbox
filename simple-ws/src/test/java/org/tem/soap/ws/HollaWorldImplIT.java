package org.tem.soap.ws;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

public class HollaWorldImplIT {

	@Test
	public void test() throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/soap/holla?wsdl");
		QName qname = new QName("http://ws.soap.tem.org/", "HollaWorldImplService");

		Service service = Service.create(url, qname);
		HollaWorld hello = service.getPort(HollaWorld.class);

		String name = "mkyong";
		System.out.println(hello.getHollaWorldAsString(name));

		assertEquals("Values not equal", HollaWorldImpl.GREETING + name, hello.getHollaWorldAsString(name));
	}

}
