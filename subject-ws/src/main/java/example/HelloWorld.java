package example;/**
 * Created by tmadison on 4/27/2015.
 */
public class HelloWorld implements IHelloWorld {
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
}
