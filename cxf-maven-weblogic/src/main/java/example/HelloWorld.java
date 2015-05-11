package example;


import javax.jws.WebService;

@WebService(endpointInterface = "example.IHelloWorld", serviceName = "IHelloWorld")
public class HelloWorld implements IHelloWorld {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}
