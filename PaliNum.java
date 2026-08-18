public class PaliNum{
    public static boolean PalNum(int number){

    int store = number;
    int reversedNumber = 0;

    for(int count = 0; store > 0; count++){

        int num = store % 10;

        store = store / 10;

        reversedNumber = reversedNumber * 10 + num; 
        }

        if(reversedNumber == number){
            return true;
        }
            return false;
        }

public static void main(String[] args){

    int number = 11212;

    boolean result = PalNum(number);

    System.out.println(result);
}
}










