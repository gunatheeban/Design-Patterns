package com.company.factory;

import com.company.model.msi.MsiGpu;
import com.company.model.msi.MsiMonitor;
import com.company.modelInterface.Gpu;
import com.company.modelInterface.Monitor;

public class MsiFactory implements ManufactureFactory{
    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
