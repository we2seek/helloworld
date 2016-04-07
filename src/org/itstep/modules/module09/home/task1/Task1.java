package org.itstep.modules.module09.home.task1;

/**
 * Задача #1
 * Используя класс Point из прошлого урока, описать классы
 *  - Rectangle (прямоугольник),
 *  - Circle (круг).
 *  В этих классах реализовать методы для нахождения периметра и площади, а также обязательно переодперделить
 *  toString на ваше усмотрение, но чтобы он был достаточно информативным.
 *
 *
 */
public class Task1 {
    public static void main(String[] args) {
        Rectangle<Integer> rectangle = new Rectangle<>(1, 5, 3, 2);
        System.out.println(rectangle.area());
    }
}
