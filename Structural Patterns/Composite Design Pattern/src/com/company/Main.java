package com.company;

public class Main {

    public static void main(String[] args) {
        Component hd = new Leaf("Hdd",5000);
        Component ram = new Leaf("RAM",3000);
        Component mouse = new Leaf("Mouse",4000);
        Component monitor = new Leaf("monitor",9000);
        Component cpu = new Leaf("CPU",5000);

        Composite internalParts = new Composite("Internal Parts");
        Composite externalParts = new Composite("External Parts");
        Composite computer = new Composite("Full Computer");

        internalParts.addComponent(hd);
        internalParts.addComponent(ram);
        internalParts.addComponent(cpu);
        externalParts.addComponent(mouse);
        externalParts.addComponent(monitor);

        computer.addComponent(internalParts);
        computer.addComponent(externalParts);

        externalParts.getPrice();
    }
}
