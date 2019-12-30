package cn.itcast.domain;

/**
 * @author : zhuyuesong
 * create at:  2019-12-29  20:05
 * @description:
 */
public class Person {
    private int age;
    private String name;

    public String a;
    protected String b;
    String c;
    private int d;

    public Person() {
    }

    public Person(int age, String name, String a) {
        this.age = age;
        this.name = name;
        this.a = a;
    }

    public void eat(){
        System.out.println("eat....");
    }

    public void eat(String food){
        System.out.println("eat " + food);
    }

    public void sleep(){
        System.out.println("sleep.........");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a=" + a +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d=" + d +
                '}';
    }
}
