package org.example;

public class CarByName {
    private Engine engine;



    public CarByName() {
        System.out.println("CarByName Constructor");
    }



    public void setEngine(Engine engine) {
        System.out.println("Engine Set Via setter Injection");
        this.engine = engine;
    }

    public void drive()
    {

        System.out.println("AutoWiring ByName");
        engine.start();
        System.out.println("car is running");
    }

}
