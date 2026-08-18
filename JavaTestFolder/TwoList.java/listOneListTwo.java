public class listOneListTwo{

    public static boolean twoList(int[] listOne, int[] listTwo){

    if(listOne.length != listTwo.length){

        return false;       
    }

    for(int count = 0; count < listOne.length; count++){

    if(listOne[count] != listTwo[count]){
        return false;
    }
    }
    return true;   

}
public static void main(String[] args){

int[] listOne  = {2, 5, 7, 9, 3};

int[] listTwo = {9, 6, 7, 12, 8};

boolean result = twoList(listOne, listTwo);

System.out.println(result);
}
}
