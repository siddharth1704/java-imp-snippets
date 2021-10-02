package tech.codingclub.oops;

public class Learnclass {
    public static void main(String[] args) {
        Car audi = new Car("UP32A1234");
        System.out.println("Current Speed Audi:" + audi.getcurrentSpeed());
        audi.accelerate();
        audi.accelerate();
        audi.accelerate();
        System.out.println("Current Speed Audi:" + audi.getcurrentSpeed());
        Car bmw = new Car("UP32S547");
        bmw.increaseSpeed(100);
        System.out.println("Current Speed BMW:" + bmw.getcurrentSpeed());
        audi.wheel = 8;
        audi.printAboutWheel();
        bmw.printAboutWheel();
        DummyCar car = new DummyCar() {
            @Override
            public void move() {

            }
        };
    }
}
