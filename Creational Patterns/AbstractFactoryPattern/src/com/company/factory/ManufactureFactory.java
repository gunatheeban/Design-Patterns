package com.company.factory;

import com.company.modelInterface.Gpu;
import com.company.modelInterface.Monitor;

public interface ManufactureFactory {
    Monitor createMonitor();
    Gpu createGpu();
}
