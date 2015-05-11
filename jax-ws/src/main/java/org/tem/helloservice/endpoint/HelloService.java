package org.tem.helloservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService()
@SOAPBinding(style = Style.RPC)
public class HelloService {
	private String message = new String("Hello, ");

	public HelloService() {
	}

	@WebMethod
	public String sayHello(String name) {
		return message + name + ".";
	}
}