package com.company;

public class Main {

    public static void main(String[] args) {
	    LaptopFactory laptopFactory = new LaptopFactory();
        laptopFactory.getLaptop(LaptopName.DELL).getLaptopName();
        laptopFactory.getLaptop(LaptopName.HP).getLaptopName();
    }
}
