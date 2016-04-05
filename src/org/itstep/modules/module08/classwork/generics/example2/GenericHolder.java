package org.itstep.modules.module08.classwork.generics.example2;

/* Полиморфный тип данных */
public class GenericHolder<T> {
    private T data;

    public GenericHolder() {
        this.data = null;
    }

    public GenericHolder(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
