package org.itstep.modules.module08.classwork.generics.example2;

class ObjectHolder {
    private Object data;

    ObjectHolder() {
        this.data = null;
    }

    ObjectHolder(Object data) {
        this.data = data;
    }

    Object getData() {
        return data;
    }

    void setData(Object data) {
        this.data = data;
    }
}
