package org.itstep.modules.module12.classwork.demodemo;

public class B extends A implements Foobable {

    B() {
        System.out.println("Constructor B");
        super.foo();
    }

    public void foo() {
        System.out.println("B-foo");
    }
}
