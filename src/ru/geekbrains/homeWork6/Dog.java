package ru.geekbrains.homeWork6;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void setRun_distance(int run_distance) {
        if (run_distance<=500){
            super.run_distance = run_distance;
        } else {
            System.out.println("Кошка не может бежать больше 500 метров");
        }
    }

    public void setSwim_distanse(int swim_distanse) {
        if(swim_distanse<=10) {
            super.swim_distanse = swim_distanse;
        } else {
            System.out.println("Собака не может плыть больше 10 метров");
        }
    }

    public void setJump_height(double jump_height) {
        if(jump_height<=0.5) {
            super.jump_height = jump_height;
        } else {
            System.out.println("Собака не может прыгать выше 0,5 метров");
        }
    }
    public void printInfo() {
        super.info();
    }
    public void do_run () {
        super.run();
    }
    public void do_swim (){
        super.swim();
    }
    public void do_jump () {
        super.jump();
    }
}
