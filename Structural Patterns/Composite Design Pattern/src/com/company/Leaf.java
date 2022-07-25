package com.company;

public class Leaf implements Component{

    private String name;
    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println(name +" : "+price);
    }

}
