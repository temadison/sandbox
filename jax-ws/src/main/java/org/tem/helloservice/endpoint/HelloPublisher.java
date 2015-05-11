package org.tem.helloservice.endpoint;

import javax.xml.ws.Endpoint;

public class HelloPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloService());
	}
}
