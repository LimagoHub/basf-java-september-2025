public class Main {
    public static void main(String[] args) {
        new B();
        new B();
    }
}
class A {
    static {
        System.out.println("A");
    }
    public A() {
        foo();
    }
    public void foo() {
        System.out.println("Foo von A");
    }
}
class B extends A {
    public B() {
        System.out.println("C");
    }
    public void foo() {
        System.out.println("Foo von B");
    }
}