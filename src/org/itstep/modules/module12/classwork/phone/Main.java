package org.itstep.modules.module12.classwork.phone;

public class Main {

    public static void main(String[] args) {
        AbstractPhone phone = new SimplePhone("Symbian", "Nokia", "C5-00");
        System.out.println(phone.getName());
        System.out.println(phone);
    }
}

abstract class AbstractPhone {
    String OS;
    String brand;
    String model;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract String getName();
}

class SimplePhone extends AbstractPhone {

    public SimplePhone(String OS, String brand, String model) {
        this.OS = OS;
        this.brand = brand;
        this.model = model;
    }

    @Override
    String getName() {
        return this.OS + " " + this.brand + " " + this.model;
    }
}