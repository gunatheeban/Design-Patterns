package com.company.model.msi;

import com.company.modelInterface.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void getMonitorType() {
        System.out.println("This is a MsiMonitor");
    }
}
