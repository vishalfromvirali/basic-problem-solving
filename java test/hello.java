import java.util.*;
class hello{
    public static void main(String[]args){
        int[] array1 ={10,20,0,30,40,0,50};
        int[] temp = new int[array1.length];
        int index=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i] !=0){
                temp[index] = array1[i];
                index++;

            }

        }
        
            System.out.println(Arrays.toString(temp));
        
    }
}