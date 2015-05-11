package org.temadison.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "DefaultHelloWorld", targetNamespace = "http://www.temadison.org")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface HelloWorld {
    @WebMethod
    @RequestWrapper(targetNamespace = "http://www.temadison.org/types")
    @ResponseWrapper(targetNamespace = "http://www.temadison.org/types")
    String sayHelloWorldFrom(String from);
}
