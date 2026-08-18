public class PaliPali{
    public static boolean pala(String word){

    String reversedWord = "";

    for(int count = word.length() - 1; count >= 0; count--){

        reversedWord = reversedWord + word.charAt(count);
    }
        if(reversedWord.equalsIgnoreCase(word)){
            return true;
    
        }

            return false;

        }

public static void main(String[] args){

    String word = "racecar";

    boolean answer = pala(word);

    System.out.println(answer);
}
}
