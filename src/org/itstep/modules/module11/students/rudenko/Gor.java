package org.itstep.modules.module11.students.rudenko;

import java.util.Comparator;

/**
 * Created by Санек on 17.04.2016.
 */
public class Gor implements Comparable<Gor> {


    private String gorod;
    private String kod;

    public Gor(String gorod, String kod) { //это конструктор, называется как класс
        this.gorod = gorod;                  // должен быть паблик, что б видно было
        this.kod = kod;
    }

    public static Comparator<Gor> GorodComparator() {
        return new Comparator<Gor>() {
            @Override
            public int compare(Gor o1, Gor o2) {
                return o1.getGorod().compareTo(o2.getGorod());
            }
        };
    }

    public static Comparator<Gor> KodComparator() {
        return new Comparator<Gor>() {
            @Override
            public int compare(Gor o1, Gor o2) {
                return o1.getKod().compareTo(o2.getKod());
            }
        };
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Gor{" +
                "gorod='" + gorod + '\'' +
                ", kod='" + kod + '\'' +
                '}';
    }

    public int compareTo(Gor that) {

        return this.getKod().compareTo(that.getKod());
    }

}


