package ru.geekbrains.homeWork6;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int run_distance;
    protected int swim_distanse;
    protected double jump_height;
//    protected int run_limit;
//    protected int swim_limit;
//    protected int jump_limit;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
//        this.run_distance = run_distance;
//        this.swim_distanse = swim_distanse;
//        this.jump_height = jump_height;
//        this.run_limit = run_limit;
//        this.swim_limit = swim_limit;
//        this.jump_limit = jump_limit;
    }

    protected void info () {
        System.out.println("Имя: "+name+"\n"+"Цвет: "+color+"\n"+"Возраст: "+age);
    }
    protected void run () {
        System.out.println(name + " бежит на " + run_distance + " м.");

    }
    protected void swim () {
        System.out.println(name + " плывет на " + swim_distanse + " м.");
    }
    protected void jump () {
        System.out.println(name + " прыгает на " + jump_height + " м.");
    }


}
