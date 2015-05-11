package org.temadison.ws;

import javax.jws.WebService;

//Service Implementation Bean

@WebService(endpointInterface = "org.temadison.ws.HelloWorld")
public class DefaultHelloWorld implements HelloWorld {

    @Override
    public String getHelloWorldAsString() {
        return "Hello World JAX-WS";
    }
}
