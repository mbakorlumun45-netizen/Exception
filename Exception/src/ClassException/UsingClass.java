package ClassException;

import java.io.IOException;

public class UsingClass {

    static class ExceptionA extends Exception {
        public ExceptionA(String message) {
            super(message);
        }
    }

    static class ExceptionB extends ExceptionA {
        public ExceptionB(String message) {
            super(message);
        }
    }

    static void report(String label, Exception exception) {
        System.out.println(label + " -> caught by Exception handler");
        System.out.println("  Message:     " + exception.getMessage());
        System.out.println("  Actual type: " + exception.getClass().getSimpleName());
        System.out.println();
    }

    static void demonstrateExceptionA() {
        try {
            throw new ExceptionA("Custom ExceptionA thrown");
        } catch (Exception exception) {
            report("ExceptionA", exception);
        }
    }

    static void demonstrateExceptionB() {
        try {
            throw new ExceptionB("Custom ExceptionB thrown");
        } catch (Exception exception) {
            report("ExceptionB", exception);
        }
    }

    static void demonstrateNullPointerException() {
        try {
            throw new NullPointerException("NullPointerException thrown");
        } catch (Exception exception) {
            report("NullPointerException", exception);
        }
    }

    static void demonstrateIOException() {
        try {
            throw new IOException("IOException thrown");
        } catch (Exception exception) {
            report("IOException", exception);
        }
    }

    static void runDemo() {
        demonstrateExceptionA();
        demonstrateExceptionB();
        demonstrateNullPointerException();
        demonstrateIOException();
    }

    public static void main(String[] args) {
        runDemo();
    }
}