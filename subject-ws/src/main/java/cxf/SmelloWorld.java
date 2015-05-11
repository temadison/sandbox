package cxf;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Map;

/**
 * Created by tmadison on 4/29/2015.
 */
@WebService
public interface SmelloWorld {
    String sayHi(@WebParam(name = "text") String text);

    String sayHiToUser(User user);

    Map<Integer, User> getUsers();
}