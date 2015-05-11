package org.temadison.example;

import javax.jws.WebService;

/**
 * Created by tmadison on 4/30/2015.
 */

@WebService(serviceName = "HelloWorld", endpointInterface = "org.temadison.example.HelloWorld", portName = "HelloWorldPort")
public class DefaultHelloWorld implements HelloWorld {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello world, from " + from;
        System.out.println(result);
        return result;
    }
}
