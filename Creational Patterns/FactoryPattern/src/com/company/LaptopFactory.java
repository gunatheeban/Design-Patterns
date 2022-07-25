package com.company;

import java.util.Locale;

public class LaptopFactory {
    public Laptop getLaptop(LaptopName laptopName){
        switch (laptopName) {
            case HP -> {
                return new Hp();
            }case DELL -> {
                return new Dell();
            }default -> {
                return null;
            }
        }
    }
}
