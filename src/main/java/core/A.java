package core;

public class A {
    private C c;

    public A(C c) {
        this.c = c;
    }

    public void init() {
        System.out.println("A created");
    }
}
