package com.company;

public class Main {

    int c = 30;
    static int b = 20;

    public static void main(String[] args) {
	// write your code here
        int sb = sb();
        System.out.println("======");
        Main main = new Main();
        main.a();
    }


    public static int sb(){
        System.out.println(b);
        int a = 15;
       return a;
    }

    public void a(){
//        非静态方法 可以使用静态资源(静态方法 以及 静态变量)
        int sb = sb();
        System.out.println(sb);
        System.out.println(b);
        System.out.println(c);
    }
}
