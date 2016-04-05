package org.itstep.modules.module08.classwork.generics.example2;

public class IntArrayHolder {
    private int [] data;

    public IntArrayHolder() {
        this.data = null;
    }

    public IntArrayHolder(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
