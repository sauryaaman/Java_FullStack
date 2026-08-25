package org.example;

public class Car {
    private Engine engine;
    public Car()
    {
        System.out.println("Car Constructor started");
    }

    public Car(Engine engine) {
        System.out.println("Engine set Via COnstructor");
        this.engine = engine;
    }

//    public Engine getEngine() {
//        return engine;
//    }

    public void setEngine(Engine engine) {
        System.out.println("Engine set via Setter Injection");
        this.engine = engine;
    }

    public void drive()
    {
        engine.start();
        System.out.println("Car is running....");
    }
}
