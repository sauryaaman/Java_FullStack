package org.example;

public class CarByType {

    private Engine engine;
    private Driver driverName;
    public CarByType()
    {
        System.out.println("Car ByType Constructor");
    }

    public void setDriverName(Driver driverName) {
        System.out.println("Driver set via the setter injection");
        this.driverName = driverName;
    }

    public void setEngine(Engine engine) {
        System.out.println("Engine is set via the setter Injection");
        this.engine = engine;
    }
    public void drive()
    {
        driverName.getDriver();
        System.out.println("AutoWiring ByType");
        engine.start();
        System.out.println("car is running");
    }

}
