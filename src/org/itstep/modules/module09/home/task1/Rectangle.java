package org.itstep.modules.module09.home.task1;

import org.itstep.modules.module08.classwork.home.task1.Point;

public class Rectangle<T extends Number> {
    private final Point<T> topLeft;
    private final Point<T> bottomRight;

    public Rectangle(T topLeftX, T topLeftY, T bottomRightX, T bottomRightY){
        this.topLeft = new Point<>(topLeftX, topLeftY);
        this.bottomRight = new Point<>(bottomRightX, bottomRightY);
    }

    public Rectangle(Point<T> topLeft, Point<T> bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double area(){

        if (this.topLeft == null || this.bottomRight == null) {
            return -1;
        }

        Point<T> bottomLeft = new Point<>(topLeft.getCoordX(), bottomRight.getCoordY());

        double sideA = bottomLeft.distanceTo(topLeft);
        double sideB = bottomLeft.distanceTo(bottomRight);

        return sideA * sideB;
    }

}
