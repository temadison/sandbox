package org.tem.rpc.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tem.rpc.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}