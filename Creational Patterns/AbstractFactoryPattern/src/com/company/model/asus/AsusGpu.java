package com.company.model.asus;

import com.company.modelInterface.Gpu;

public class AsusGpu implements Gpu {
    @Override
    public void getGpu() {
        System.out.println("This is a AsusGpu");
    }
}
