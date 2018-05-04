package com.generic;

/**
 * Created by student on 04.05.2018.
 */
public class GeneralObject<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GeneralObject{" +
                "t=" + t +
                '}';
    }
}
