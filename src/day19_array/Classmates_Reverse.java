package day19_array;

public class Classmates_Reverse {
    public static void main(String[] args) {
        String [] classMates={"Ahm Ozm", "Umra Ona", "Oz On", "Ism Us", "Ned Usl","Sib De","Ay Us","Ay Dur","Em De","Fat Man"};
        for (int i = 0; i < classMates.length; i++) {
            String name=classMates[i];

            String reversedName="";
            for (int j=name.length()-1; j>=0;j--){
                reversedName+=name.charAt(j);
            }
            System.out.println(reversedName);
        }

    }

}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */