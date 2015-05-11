package org.tem.soap.ws;

import javax.xml.ws.Endpoint;

public class HollaWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/soap/holla", new HollaWorldImpl());
	}

}