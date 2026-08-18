public class twoListMerg{
    public static int[] merge(int[] listOne, int[] listTwo){

    int[] result = new int[] [listOne.length + listTwo.length];

    for(int count = 0; count < listOne.length; count++){
            result[count] = listOne[count];
            }
        for(int count = 0; count < listTwo.length; count++){
            result[listOne.length + count] = listTwo[count];                         
                                                               
            }
    
    
    return result;
    }

    public static void main(String[] args){

    int[] listOne = {5, 1, 5, 16, 61, 111};

    int[] listTwo = {4, 2, 4, 5, 6};

    int result = merge(listOne, listTwo);

    System.out.println(result);
    }
    }
