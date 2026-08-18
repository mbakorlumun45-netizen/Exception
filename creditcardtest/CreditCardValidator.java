import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello, Kindly Enter Card Details to Verify: ");
        String numbers = input.nextLine().replaceAll("[^0-9]", "");

        if (numbers.length() < 13 || numbers.length() > 16) {
            System.out.println("Invalid Card Length");
            return;
        }

        String cardCategory = cardType(numbers);

        if (cardCategory == null) {
            System.out.println("Invalid Card Type");
            return;
        }

        if (cardValidationNumber(numbers)) {
            System.out.println("******************************");
            System.out.println("Credit Card Type: " + cardCategory);
            System.out.println("Credit Card Number: " + numbers);
            System.out.println("Card Length: " + numbers.length());
            System.out.println("Credit Card Status: Valid");
            System.out.println("******************************");
        } else {
            System.out.println("******************************");
            System.out.println("Credit Card Type: " + cardCategory);
            System.out.println("Credit Card Number: " + numbers);
            System.out.println("Card Length: " + numbers.length());
            System.out.println("Credit Card Status: valid");
            System.out.println("******************************");
        }

        //input.close();
    }

    public static String cardType(String numbers) {

        if (numbers.startsWith("4")) {
            return "Visa Card";
        } else if (numbers.startsWith("5")) {
            return "MasterCard";
        } else if (numbers.startsWith("37")) {
            return "American Express";
        } else if (numbers.startsWith("6")) {
            return "Discover Cards";
        }

        return null;
    }

    public static boolean cardValidationNumber(String numbers) {

        int sum = 0;
        boolean doubleDigit = false;

        for (int count = numbers.length() - 1; count >= 0; count--) {

            int digit = Character.getNumericValue(numbers.charAt(count));

            if (doubleDigit) {
                digit *= 2;

                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
