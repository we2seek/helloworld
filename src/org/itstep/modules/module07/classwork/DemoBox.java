package org.itstep.modules.module07.classwork;

class Box {
    double weight;
    double height;
    double depth;
    static int count;

    Box() {
        this.weight = 10.0;
        this.height = 20.0;
        this.depth = 15.0;
        count++;
    }

    Box(double weight, double height, double depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
        count++;
    }

    void volume() {

        System.out.println("Volume is: " + (weight * height * depth));
    }

    static void say(){
        System.out.println("Hello");
    }

    double volume(double w, double h, double d) {
        return weight * height * depth;
    }
}

public class DemoBox {
    public static void main(String[] args) {
        org.itstep.modules.module07.classwork.Box myBox = new Box();
        System.out.println(Box.count);
        Box myBox2 = new Box(1, 5, 1);
        System.out.println(Box.count);
        Box.say();
    }
}
