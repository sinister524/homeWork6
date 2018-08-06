package ru.geekbrains.homeWork6;

public class Main {

    public static void main(String[] args) {

        Cat cissi = new Cat("Narcissa","grey",1);
        Dog ronya = new Dog("Ronald","yellow",12);
        cissi.setJump_height(1.8);
        cissi.setRun_distance(150);
        cissi.setSwim_distanse(5);
        cissi.printInfo();
        cissi.do_jump();
        cissi.do_run();
        cissi.do_swim();

        ronya.setJump_height(1.5);
        ronya.setSwim_distanse(6);
        ronya.setRun_distance(400);
        ronya.printInfo();
        ronya.do_jump();
        ronya.do_run();
        ronya.do_swim();

    }
}
