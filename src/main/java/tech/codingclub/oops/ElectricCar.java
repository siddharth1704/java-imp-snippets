package tech.codingclub.oops;

public class ElectricCar extends Car {
    private double batteryLeft;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String numberPlate) {
        super(numberPlate);
    }

    public ElectricCar(String numberPlate, int currentSpeed) {
        super(numberPlate, currentSpeed);
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("TESLA");
        tesla.accelerate();
        ElectricCar.printAboutWheel();
        System.out.println("TESLA SPEED" + tesla.getcurrentSpeed() + "Battery left :" + tesla.getBatteryLeft());
    }

    public void accelerate() {
        super.accelerate();
        batteryLeft -= 0.50;
    }

    public double getBatteryLeft() {
        return batteryLeft;
    }
}
