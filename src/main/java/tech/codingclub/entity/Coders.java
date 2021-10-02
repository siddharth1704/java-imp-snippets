package tech.codingclub.entity;

public class Coders {
    private String name;

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    private Long age;
    public Coders(){

    }
    public Coders(String name,Long age){
        this.name=name;
        this.age=age;
    }
}
