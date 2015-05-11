package org.tem.soap.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.tem.soap.ws.HollaWorld;

public class HollaWorldClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/soap/holla?wsdl");
		QName qname = new QName("http://ws.soap.tem.org/", "HollaWorldImplService");

		Service service = Service.create(url, qname);
		HollaWorld hello = service.getPort(HollaWorld.class);

		System.out.println(hello.getHollaWorldAsString("mkyong"));
	}
}
