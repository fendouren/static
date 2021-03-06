package com.company;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * @author qinyadong
 * @create 2021-02-21 20:37
 */
public class TestAnimal {

    public static void main(String[] args) {

//        Animal animal = new Animal();
//
//        animal.age = 18;
//        animal.heiget = 38;
//        animal.name = "小林子";
//
//        System.out.println(animal);
//        System.out.println(">>>>>>>>>>>");
//        System.out.println(new Animal("么人",18,12));
//        System.out.println(new Animal());
//        animal.work();
//        animal.sleep();
//        new Animal().sleep();

//        Animal animal = new Animal("美女",15,15);
//        System.out.println(animal.age);
//        System.out.println(animal.ab);
//        System.out.println(animal.name);
//        System.out.println(Animal.name);
//        animal.sleep();
//        String name = animal.getName();
//        System.out.println(name);
//        System.out.println(animal);
//        int[] arr = {1,2,3,4,6};
//        System.out.println(arr[1]);
//        System.out.println(arr.length);
//        String a1 = " i love you";
//        int i = a1.length();
//        System.out.println(i);
//        int a = 20;
//        int d = 20;
//        System.out.println("Class A: a="+a +"\td="+d);
//        char b = '白';

        int i = (int) (Math.random() * 100) + 1;
       System.out.println(i);
        Scanner scanner = new Scanner(System.in);
        while (true){
            int nextInt = scanner.nextInt();
            if (nextInt > i){
                System.out.println("大了");
            }else if (nextInt < i ){
                System.out.println("小了");
            }else {
                System.out.println("成功");
            }
        }
    }
}
