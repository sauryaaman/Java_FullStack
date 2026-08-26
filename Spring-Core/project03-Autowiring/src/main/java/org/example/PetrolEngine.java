package org.example;

public class PetrolEngine implements  IEngine{

    public PetrolEngine() {
        System.out.println("Petrol Engine COnstrcutor");
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
