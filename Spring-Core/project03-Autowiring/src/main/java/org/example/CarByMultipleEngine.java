package org.example;

public class CarByMultipleEngine {
    private IEngine iengine;

    public CarByMultipleEngine() {
        System.out.println("CarByMultiple Constructor");
    }

    public CarByMultipleEngine(IEngine iengine) {
        System.out.println("Engine Set via the  construction injection");
        this.iengine = iengine;
    }

    public void setEngine(IEngine iengine) {
        System.out.println("engine Set via tha setter injection");
        this.iengine = iengine;
    }

    public void drive()
    {
        iengine.start();
        System.out.println("CarByMultiple Engine is started");
    }
}
