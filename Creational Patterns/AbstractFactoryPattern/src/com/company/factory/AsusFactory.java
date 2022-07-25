package com.company.factory;

import com.company.model.asus.AsusGpu;
import com.company.model.asus.AsusMonitor;
import com.company.modelInterface.Gpu;
import com.company.modelInterface.Monitor;

public class AsusFactory implements ManufactureFactory{
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
