package cxf;

/**
 * Created by tmadison on 4/29/2015.
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}