package RethrowingException;

public class Rethrowing {

    // 11.20

    static void someMethod2() throws Exception {
        throw new Exception("Exception originally thrown in someMethod2");
    }

    static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("someMethod: caught exception, rethrowing it");
            throw e;
        }
    }

    static void runDemo() {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("main: caught the rethrown exception");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        runDemo();
    }
}