package day19_array;
import java.util.Arrays;
public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
       int[] array = {10, 0, 5, 0, 1, 0};
       int[] arr1=new int[array.length];

       int k=0;
       for(int i=0; i<array.length; i++){
           if(array[i]==0){continue;}else{arr1[k++]=array[i]; }
       }
        System.out.println(Arrays.toString(arr1));

    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                 {10, 5, 1, 0, 0, 0}
 */