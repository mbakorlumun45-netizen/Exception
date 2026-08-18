public class numSameValue{
    public static boolean isConsercutiveFour(int[] numbers){

    
    for(int count = 0; count < numbers.length - 4; count++){
        if(numbers[count] == numbers[count] && numbers[count] == numbers[count + 1] && numbers[count] ==        numbers[count + 2] && numbers[count] == numbers[count + 3]){
                return true;
                }
                       
                }
                return false;
                }

    public static void main(String[] args){

    int[] numbers = {3, 4, 5, 5, 5, 5, 8};

    boolean result = isConsercutiveFour(numbers);

    System.out.println(result);
}
}   
