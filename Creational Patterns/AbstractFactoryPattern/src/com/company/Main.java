package com.company;

import com.company.factory.ManufactureFactory;

public class Main {

    public static void main(String[] args) {
        ManufactureFactory msiFactory = CompanyFactoryBuilder.manufactureFactory(true);
        msiFactory.createGpu().getGpu();

        ManufactureFactory asusFactory = CompanyFactoryBuilder.manufactureFactory(true);
        asusFactory.createMonitor().getMonitorType();
    }
}
