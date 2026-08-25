package org.example;

public class DieselEngine implements  Engine{

    public DieselEngine()
    {
        System.out.println("Diesel Engine Constructor");
    }
    @Override
    public void start() {
        System.out.println("Diesel Engine Started");
    }
}
