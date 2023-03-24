package day20_forEachLoop;

public class CommonElements {
    public static void main(String[] args){

        int[] arr1= {1,2,3,4,5,4,9,1,9 };
        int[] arr2= {4,5,6,7,8,9,1};
        String result="";
        for(int each: arr1){
            for(int each1:arr2){
                if (each==each1 && (!result.contains(each+""))) {result+=each; System.out.print(each +" ");}

            }

        }System.out.println();

    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops
 */