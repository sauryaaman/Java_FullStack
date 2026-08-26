package org.example;



public class CarByConstructor {
    private Engine engine;


    public CarByConstructor() {
        System.out.println("CarByConstructor Constructor");

    }

    public CarByConstructor(Engine engine) {
        System.out.println("Engine set via the constructor Injection");
        this.engine = engine;
    }

//    public void setEngine(Engine engine) {
//        System.out.println("Engine Set Via setter Injection");
//        this.engine = engine;
//    }

    public void drive()
    {
        System.out.println("AutoWiring constructor");
        engine.start();
        System.out.println("car is running");
    }

}

