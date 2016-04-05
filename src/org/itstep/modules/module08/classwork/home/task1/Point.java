package org.itstep.modules.module08.classwork.home.task1;

class Point<T extends Number> {
    private T coordX;
    private T coordY;

    Point(T coordX, T coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    double distanceTo(Point<? extends Number> anotherPoint) {
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
