package example;/**
 * Created by tmadison on 4/27/2015.
 */
public interface IHelloWorld extends java.rmi.Remote {
  public String sayHelloWorldFrom(String from) throws java.rmi.RemoteException;
}
