package ru.geekbrains.homeWork6;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public boolean setRun_distance(int run_distance) {
        super.run_distance = run_distance;
        if (run_distance<=200){
            return true;
        } else {
            return false;
        }
    }

    public boolean setSwim_distanse(int swim_distanse) {
        return false;
    }

    public boolean setJump_height(double jump_height) {
        super.jump_height = jump_height;
        if(jump_height<=2) {
            return true;
        } else {
            return false;
        }
    }
    public void printInfo() {
        super.info();
    }
    public void do_run () {
        if (setRun_distance(run_distance)==true){
            super.run();
        } else {
            System.out.println("Кошка не может бежать больше 200 метров");
        }
    }
    public void do_swim (){
        if (setSwim_distanse(swim_distanse)==true){
            super.swim();
        } else {
            System.out.println("Кошка не может плавать");
        }
    }
    public void do_jump () {
        if (setJump_height(jump_height)==true){
            super.jump();
        } else {
            System.out.println("Кошка не может прыгать выше 2 метров");
        }
    }
}
