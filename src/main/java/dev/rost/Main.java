package dev.rost;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println("new A();");
        var a = new A();
        System.out.println("A.STATIC_STRING = " + A.STATIC_STRING);

        System.out.println("\nnew B()");
        var b = new B();
        System.out.println("A.STATIC_STRING = " + A.STATIC_STRING);
        System.out.println("b.getStaticString() = " + b.getStaticString());

        System.out.println("\nnew C()");
        var c = new C();
        System.out.println("A.STATIC_STRING = " + A.STATIC_STRING);
        System.out.println("b.getStaticString() = " + b.getStaticString());
    }
}
