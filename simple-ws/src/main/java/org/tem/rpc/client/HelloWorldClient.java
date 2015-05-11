package org.tem.rpc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.tem.rpc.ws.HelloWorld;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9999/ws/rpc/hello?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://ws.rpc.tem.org/", "HelloWorldImplService");

		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);

		System.out.println(hello.getHelloWorldAsString("mkyong"));
	}
}
