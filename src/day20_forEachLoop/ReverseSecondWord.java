package day20_forEachLoop;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        //         012345678910
        int count = 0;
        for (int i = sentence.length() - 1, j = 0; i >= 0; i--, j++) {
//            if ((sentence.charAt(i)+"").equals(" ")){
//                System.out.println("i = " + i);
//            }
            if (i >= 2 && i <= 5) System.out.print(sentence.charAt(i));


        }
    }
}

/*
Write a program that can reverse & print the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */