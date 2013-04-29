package org.openappstore.entities;

import lombok.Data;

@Data
public class Application {

    public Application(String name) {
        this.name = name;
    }

    private String name;


}
