package org.itstep.modules.module11.classwork;

import java.util.Comparator;

public class StringAscendingComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
