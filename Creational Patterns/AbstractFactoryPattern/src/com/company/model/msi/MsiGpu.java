package com.company.model.msi;

import com.company.modelInterface.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void getGpu() {
        System.out.println("This is a MsiGpu");
    }
}
