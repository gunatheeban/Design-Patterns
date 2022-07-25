package com.company.model.asus;

import com.company.modelInterface.Monitor;

public class AsusMonitor implements Monitor {
    @Override
    public void getMonitorType() {
        System.out.println("This is a Asus Monitor");
    }
}
