package org.example;

public class CarByType {

    private Engine engine;

    public CarByType()
    {
        System.out.println("Car ByType Constructor");
    }

    public void setEngine(Engine engine) {
        System.out.println("Engine is set via the setter Injection");
        this.engine = engine;
    }
    public void drive()
    {
        System.out.println("AutoWiring ByType");
        engine.start();
        System.out.println("car is running");
    }

}
