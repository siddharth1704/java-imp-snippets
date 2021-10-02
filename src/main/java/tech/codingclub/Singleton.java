package tech.codingclub;

public class Singleton {

    private static Singleton singleton;
    int data;

    private Singleton(int data) {
        this.data = data;
        System.out.println("Constructor was call when data wa :" + data);
    }

    public static Singleton getInstance(int data) {
        if (singleton == null) {
            singleton = new Singleton(data);
        }
        return singleton;
    }
}
