package org.itstep.modules.module03.students.rudenko;

public class ProstNumber {
    public static void main(String[] args) {
        int prost;
        int temp;
        for (prost = 2; prost < 1001; prost++) {
            temp = 0;
            for (int i = 1; i <= prost; i++) {
                if (prost % i == 0)
                    temp++;
            }
            if (temp <= 2)
                System.out.println(prost);
        }
    }

}
