package com.company;

import com.company.factory.AsusFactory;
import com.company.factory.ManufactureFactory;
import com.company.factory.MsiFactory;

public class CompanyFactoryBuilder {
    public static ManufactureFactory manufactureFactory(boolean test){
        if(test){
            return new MsiFactory();
        }else{
            return new AsusFactory();
        }
    }
}
