package CatchingException;

public class Catching {

//    11.16

    public class ExceptionDemo {

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

        static class ExceptionC extends ExceptionB {
            public ExceptionC(String message) {
                super(message);
            }
        }

        static void throwExceptionA() throws ExceptionA {
            throw new ExceptionA("This is an ExceptionA");
        }

        static void throwExceptionB() throws ExceptionB {
            throw new ExceptionB("This is an ExceptionB");
        }

        static void throwExceptionC() throws ExceptionC {
            throw new ExceptionC("This is an ExceptionC");
        }

        static void catchWithExceptionA(String label, ThrowingAction action) {
            try {
                action.run();
            } catch (ExceptionA e) {
                System.out.println(label + " -> caught by ExceptionA handler: " + e.getMessage());
                System.out.println("  Actual type: " + e.getClass().getSimpleName());
            }
        }

        interface ThrowingAction {
            void run() throws ExceptionA;
        }

        static void runDemo() {
            catchWithExceptionA("Throwing A", ExceptionDemo::throwExceptionA);
            catchWithExceptionA("Throwing B", ExceptionDemo::throwExceptionB);
            catchWithExceptionA("Throwing C", ExceptionDemo::throwExceptionC);
        }

        public static void main(String[] args) {
            runDemo();
        }
    }
}
