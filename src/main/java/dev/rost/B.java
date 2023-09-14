package dev.rost;

public class B extends A {
    static {
        STATIC_STRING = "STATIC_STRING from B";
    }

    public String getStaticString() {
        return STATIC_STRING;
    }
}
