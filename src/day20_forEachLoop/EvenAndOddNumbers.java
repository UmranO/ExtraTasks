package day20_forEachLoop;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int[] arr=new int[11];
        int even=0;
        int odd =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
            if (arr[i]%2==0){even++;}else {odd++;}
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        
        System.out.println("-With for each loop--------------------------------------------------------------");
        int even1=0;
        int odd1 =0;
        for(int each:arr){
            if (each%2==0){even1++;}else {odd1++;}
        }
        System.out.println("odd = " + odd1);
        System.out.println("even = " + even1);
        }
        
    }

/*
Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
 */
