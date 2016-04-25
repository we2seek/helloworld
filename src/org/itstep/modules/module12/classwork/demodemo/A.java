package org.itstep.modules.module12.classwork.demodemo;

public class A implements Foobable {

    A() {
        System.out.println("Constructor A");
        foo();
    }

    @Override
    public void foo() {
        System.out.println("A-foo");
    }
}