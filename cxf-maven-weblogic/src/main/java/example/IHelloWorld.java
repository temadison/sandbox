package example;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {
    String sayHelloWorldFrom(@WebParam(name = "from") String from);
}
