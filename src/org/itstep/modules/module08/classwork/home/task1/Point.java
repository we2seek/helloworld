package org.itstep.modules.module08.classwork.home.task1;

public class Point<T extends Number> {
    private T coordX;
    private T coordY;

    public Point(T coordX, T coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public T getCoordX() {
        return coordX;
    }

    public void setCoordX(T coordX) {
        this.coordX = coordX;
    }

    public T getCoordY() {
        return coordY;
    }

    public void setCoordY(T coordY) {
        this.coordY = coordY;
    }

    public double distanceTo(Point<? extends Number> anotherPoint) {
        double dx = this.coordX.doubleValue() - anotherPoint.coordX.doubleValue();
        double dy = this.coordY.doubleValue() - anotherPoint.coordY.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.coordX);
        sb.append("; ");
        sb.append(this.coordY);
        sb.append(')');

        return sb.toString();
    }
}
