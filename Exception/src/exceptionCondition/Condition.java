package exceptionCondition;

//No 1:
//1: ArithmeticException;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Condition {
    public static int quotient(int numerator, int denominator){
        return numerator / denominator;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerator: ");
        int numerator = input.nextInt();

        System.out.println("Enter denominator: ");
        int denominator = input.nextInt();

        try{
            int result = 10 / 0;
                System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }
        System.out.println("Program continue");
    }
    }

//    2: InputMismatchException;



