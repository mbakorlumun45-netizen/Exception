public class countFromBack{
    public static int sum(int number){

    int reverseAdd = 0;
    int sum = 0;
    for(int count = 1; count <= number; count++){
        for(int counter = 1; counter <= number ; counter++){
            while(count <= number){
            reverseAdd = count + counter;
            sum = reverseAdd;
        
        }
        }
        }
        return sum;

        }

public static void main(String[] args){

int number = 4;

int result = sum(number);

System.out.print(result);
}
}
