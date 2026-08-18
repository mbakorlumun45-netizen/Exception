import java.util.Scanner;
public class PalDrum{
    public static boolean palindromeWord(String word){

        String reverseWord = "";
        for (int count = word.length() - 1; count >= 0; count--) {
            reverseWord = reverseWord + word.charAt(count);
        }

        if (reverseWord.equalsIgnoreCase(word)) {
            return true;
        }

        return false;
    
}

    public static boolean palindromeNumber(int number){

        int store = number;
        int reverseNumber = 0;
        for (int count = 0; store > 0; count++) {
            int num = store % 10;
            store = store / 10;
            reverseNumber = reverseNumber * 10 + num;
        }

        if (reverseNumber == number) {
            return true;
        }

        return false;
    
}

        public static void main(String[] args) {
            System.out.println(palindromeWord("MadAme"));
            System.out.println(palindromeNumber(1217));
        }
}
