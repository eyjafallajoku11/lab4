package main.things;

import main.general_interface;

public class Entity implements general_interface {
    String name;
    String status;
    public Entity(String name, String status){
        this.name=name;
        this.status=status;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return status;
    }
}
