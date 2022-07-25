package com.company;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Component> components = new ArrayList<>();
    String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void getPrice() {
        System.out.println(name);
        for (Component component: components){
            component.getPrice();
        }

    }
}
