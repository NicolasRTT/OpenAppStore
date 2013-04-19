package org.openappstore.entities;

/**
 * Created with IntelliJ IDEA.
 * User: nicolas
 * Date: 19/04/13
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    public String getName() {
        return name;
    }
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public Application(String name) {
        this.name = name;

    }

}
