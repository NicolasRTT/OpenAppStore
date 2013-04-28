package org.openappstore.entities;


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
