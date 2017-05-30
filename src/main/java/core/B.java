package core;

public class B{
    A a;

    public B() {
    }

    public void setA(A a) {
        this.a = a;
    }

    public void init() {
        System.out.println("B created");
    }
}
