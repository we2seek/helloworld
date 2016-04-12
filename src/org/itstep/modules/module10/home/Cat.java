package org.itstep.modules.module10.home;

public class Cat implements Comparable<Cat> {
    private String name;
    private double mass;

    public Cat(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cat [");
        sb.append(getName());
        sb.append(", ");
        sb.append(String.format("%.4f", getMass()));
        sb.append(" кг]");
        return sb.toString();
    }

    @Override
    public int compareTo(Cat that) {
        return Double.compare(this.getMass(), that.getMass());
    }
}
