package org.itstep.modules.module08.classwork.home.task1;


class Line<T extends Number> {
    private Point<T> a;
    private Point<T> b;

    public Line(Point<T> a, Point<T> b) {
        this.a = a;
        this.b = b;
    }

    public double length() {
        return a.distanceTo(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Line ");
        sb.append(this.a);
        sb.append(" - ");
        sb.append(this.b);
        sb.append(" length: ");
        sb.append(String.format("%.1f", this.length()));

        return sb.toString();
    }
}
