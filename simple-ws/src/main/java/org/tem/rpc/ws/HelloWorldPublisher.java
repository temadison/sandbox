package org.tem.rpc.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/rpc/hello", new HelloWorldImpl());
	}

}