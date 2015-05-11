package org.tem.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tem.soap.ws.HollaWorld")
public class HollaWorldImpl implements HollaWorld {

	static final String GREETING = "Holla World JAX-WS ";

	@Override
	public String getHollaWorldAsString(String name) {
		return GREETING + name;
	}
}