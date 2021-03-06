package com.company;

/**
 * @author qinyadong
 * @create 2021-03-01 21:57
 */
public class Son extends Parents {

    int a = 30;
    static int b = 40;

    public Son(String name, String age, int a, int c, int d, int a1, String lin) {
        super(name, age, a, c, d);
        this.a = a1;
        this.lin = lin;
    }

    public Son(int a, String lin) {
        this.a = a;
        this.lin = lin;
    }

    public Son(String name, String age, int a, int c, int d) {
        super(name, age, a, c, d);
    }

    String lin = "ab";

    public  void ab (){
        System.out.println(super.b);
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.age);
        this.pract();

    }

    public void home(){
        System.out.println("我是子类的家");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("我是重写以后的子类吃方法");
    }
    @Override
    public void play(){
        super.play();
        System.out.println("我是可以扩展的玩方法");
    }
}
