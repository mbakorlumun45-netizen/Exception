package UsingOuterScope;

public class OuterScope {

//    11.21

    public class OuterScopeDemo {

        static void divide(int numerator, int denominator) {
            try {
                System.out.println("Result: " + (numerator / denominator));
            } catch (ArithmeticException e) {
                System.out.println("divide: handled ArithmeticException locally");
            }
        }

        static void process(int[] values, int index, int denominator) {
            try {
                int number = values[index]; // may throw ArrayIndexOutOfBoundsException
                System.out.println("Result: " + (number / denominator));
            } catch (ArithmeticException e) {
                System.out.println("process: handled ArithmeticException locally");
            }
        }

        static void runDemo() {
            int[] values = {10, 20, 30};

            try {
                System.out.println("--- Divide by zero (caught inside process) ---");
                process(values, 0, 0);

                System.out.println("--- Bad index (slips through to runDemo) ---");
                process(values, 5, 2);

                System.out.println("This line is never reached");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("runDemo: handled outer-scope exception -> " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            runDemo();
        }
    }
}
