package com.company;

/**
 * @author qinyadong
 * @create 2021-02-21 20:35
 */
public class Animal {

      static String name;
      static int ab = 0;

    int age;

    int heiget;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeiget() {
        return heiget;
    }

    public void setHeiget(int heiget) {
        this.heiget = heiget;
    }

    public void sleep() {
        System.out.println("我会睡觉");
    }

    private void work() {
        System.out.println("我会工作");
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heiget=" + heiget +
                '}';
    }

    public Animal(String name, int age, int heiget) {
        this.name = name;
        this.age = age;
        this.heiget = heiget;
    }
}
