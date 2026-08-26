package org.example;

public class DieselEngine implements  IEngine{
    public DieselEngine() {
        System.out.println("Diesel engine Constrcutor");
    }

    @Override
    public void start() {
        System.out.println("Diesel Engine Started");
    }
}
