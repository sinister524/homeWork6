package ru.geekbrains.homeWork6;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public boolean setRun_distance(int run_distance) {
        super.run_distance = run_distance;
        if (run_distance<=500){
            return true;
        } else {
            return false;
        }
    }

    public boolean setSwim_distanse(int swim_distanse) {
        super.swim_distanse = swim_distanse;
        if (swim_distanse<=10) {
            return true;
        } else {
            return false;
        }

    }

    public boolean setJump_height(double jump_height) {
        super.jump_height = jump_height;
        if(jump_height<=0.5) {
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
            System.out.println("Собака не может бежать больше 500 метров");
        }
    }
    public void do_swim (){
        if (setSwim_distanse(swim_distanse)==true){
            super.swim();
        } else {
            System.out.println("Собака не может плыть больше 10 метров");
        }
    }
    public void do_jump () {
        if (setJump_height(jump_height)==true){
            super.jump();
        } else {
            System.out.println("Собака не может прыгать выше 0,5 метров");
        }
    }
}
