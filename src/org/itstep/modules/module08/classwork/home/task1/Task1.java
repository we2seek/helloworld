package org.itstep.modules.module08.classwork.home.task1;

/**
 * Создать класс, который описывает разные геометрические фигуры и позволяет вычислить их площадь.
 * Использовать наследование и обобщения. На самом верхнем уровне иерархии должен быть класс Pointer (x, y).
 * Таким образом, у треугольника будет три поля Pointer, И т.д.
 */
public class Task1 {
    public static void main(String[] args) {
        /*
        // integer points
        Point<Integer> pointA = new Point<>(0,0);
        Point<Integer> pointB = new Point<>(0,4);
        Point<Integer> pointC = new Point<>(0,1);
        */

        /*
        // wrong
        Point<Double> pointA = new Point<>(0, 0);
        Point<Double> pointB = new Point<>(3, 0);
        Point<Double> pointC = new Point<>(0, 4);
        */

        // double points
        Point<Double> pointA = new Point<>(0.0, 0.0);
        Point<Double> pointB = new Point<>(1.0, 1.0);
        Point<Double> pointC = new Point<>(0.0, 3.0);

//        System.out.println(pointA);
//        System.out.println(pointB);
//        System.out.println(pointC);

        Line<Double> ab = new Line<>(pointA, pointB);
        Line<Double> ac = new Line<>(pointA, pointC);
        Line<Double> bc = new Line<>(pointB, pointC);

//        System.out.println(ab);
//        System.out.println(ac);
//        System.out.println(bc);

        Triangle triangle = new Triangle(ab, ac, bc);

        System.out.println(triangle.area(
                new Point<Integer>(15,15),
                new Point<Integer>(23,30),
                new Point<Integer>(50,25)
        ));
    }
}
