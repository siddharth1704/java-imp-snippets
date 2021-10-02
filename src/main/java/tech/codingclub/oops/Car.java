package tech.codingclub.oops;

import tech.codingclub.Carinterface;

public class Car implements Carinterface {
    static int wheel = 4;
    final int maxSpeed = 300;//now this value cant be changed
    String numberPlate;
    private int currentSpeed = 0;

    public Car() {

    }

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public Car(String numberPlate, int currentSpeed) {
        this.currentSpeed = currentSpeed;
        this.numberPlate = numberPlate;
    }

    public static void printAboutWheel() {
        System.out.println("Car has " + wheel + " wheels");
    }

    public static void main(String[] args) {


    }

    @Override
    public void move() {

    }

    public void accelerate() {
        currentSpeed++;
    }

    @Override
    public void fillFuel() {

    }

    @Override
    public void applybreak() {

    }

    public int getcurrentSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed(int i) {
        if (currentSpeed + i < maxSpeed)
            currentSpeed += i;
        else
            currentSpeed = maxSpeed;
    }
}
