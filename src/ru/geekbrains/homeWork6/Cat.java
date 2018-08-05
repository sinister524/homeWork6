package ru.geekbrains.homeWork6;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public void setRun_distance(int run_distance) {
        if (run_distance<=200){
            super.run_distance = run_distance;
        } else {
            System.out.println("Кошка не может бежать 200 метров");
        }
    }

    public void setSwim_distanse(int swim_distanse) {
        System.out.println("Кошка не плавает");
    }

    public void setJump_height(double jump_height) {
        if(jump_height<=2) {
            super.jump_height = jump_height;
        } else {
            System.out.println("Кошка не может прыгать выше 2 метров");
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
