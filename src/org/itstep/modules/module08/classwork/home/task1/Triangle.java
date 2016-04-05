package org.itstep.modules.module08.classwork.home.task1;

class Triangle {

    private Line sideA;
    private Line sideB;
    private Line sideC;

    Triangle(Line sideA, Line sideB, Line sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Проверяем существует ли такой треугольник. Сумма любых двух сторон всегда больше третьей.
     *
     * @return true - если существет, иначе - false
     */
    private boolean isExists(double lengthA, double lengthB, double lengthC) {
        return Double.compare(lengthA + lengthB, lengthC) > 0
                && Double.compare(lengthA + lengthC, lengthB) > 0
                && Double.compare(lengthB + lengthC, lengthA) > 0;
    }

    /**
     * Проверяем существует ли такой треугольник. Сумма любых двух сторон всегда больше третьей.
     *
     * @return TRUE - если существет, иначе - FALSE
     */
    boolean isExists() {
        return isExists(this.sideA.length(), this.sideB.length(), this.sideC.length());
    }

    /**
     * Вычисляет площадь треугольника. Площадь тругольника по формуле Герона равна корню из произведения разностей
     * полупериметра треугольника (p) и каждой из его сторон (sideA, sideB, sideC).
     *
     * @return Площадь заданного треугольника. Если треугольник по заданным координатам не определен, возвращается -1
     */
    public double area() {
        if (!isExists()) {
            return -1;
        }
        // Полупериметр
        double p = (this.sideA.length() + this.sideB.length() + this.sideC.length()) / 2.0;
        double area = Math.sqrt(p * (p - this.sideA.length()) * (p - this.sideB.length()) * (p - this.sideC.length()));

        return area;
    }

    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("Triangle {");
        sb.append(newLine);
        sb.append('\t');
        sb.append(this.sideA);
        sb.append(newLine);
        sb.append('\t');
        sb.append(this.sideB);
        sb.append(newLine);
        sb.append('\t');
        sb.append(this.sideC);
        sb.append(newLine);
        sb.append("\tArea: ");
        sb.append(this.area());
        sb.append(newLine);
        sb.append('}');

        return sb.toString();
    }
}
