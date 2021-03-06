package com.company;

/**
 * @author qinyadong
 * @create 2021-03-01 21:56
 */
public class Parents {


    public Parents(String name, String age, int a, int c, int d) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.c = c;
        this.d = d;
    }

    String name = "fulei";
    String age = "18";

    public Parents() {
        System.out.println("我是父类的空参构造");
    }

    int a = 10;
    static int b = 20;
    int c = 100;
    int d = 200;

    public void eat() {
        System.out.println("我是父类的吃方法");
    }

    public void play() {
        System.out.println("我是超类的玩方法");
    }

    public void pract() {
        System.out.println("我是chaoren ");
    }
}
