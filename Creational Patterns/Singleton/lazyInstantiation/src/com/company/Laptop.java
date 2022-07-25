package com.company;

public class Laptop {

    private static Laptop laptop;
    private String name;

    private Laptop(String name){
        this.name = name;
    }

    public static Laptop getLaptop(){
        if(laptop == null){
            laptop = new Laptop("HP");
        }
        return laptop;
    }

    public void getLaptopName(){
        System.out.printf("Laptop Name "+this.name);
    }

}
