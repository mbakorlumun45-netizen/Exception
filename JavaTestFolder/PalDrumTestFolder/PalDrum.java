import java.util.Scanner;
public class PalDrum{
    public static String palindrome(String word){

        String reverseWord = "";
        for (int count = word.length() - 1; count >= 0; count--) {
            reverseWord = reverseWord + word.charAt(count);
        }

        return reverseWord;
    
}

        public static void main(String[] args) {
            System.out.println(palindrome("Happy"));
        }
}
