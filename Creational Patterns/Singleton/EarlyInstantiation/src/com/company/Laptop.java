package com.company;

public class Laptop {
    private static Laptop laptop = new Laptop(LaptopType.HP);
    private String laptopType;
    private Laptop(LaptopType laptopTypeName){
        this.laptopType = laptopTypeName.name();
    }

    public static Laptop getLaptop(){
        return laptop;
    }

    public void dosomthing(){
        System.out.println("this Laptop "+ laptop.laptopType);
    }

}
