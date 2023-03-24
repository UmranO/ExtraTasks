package day19_array;
public class Classmates {
    public static void main(String[] args) {
        String [] classMates={"Ahm Ozm", "Umra Ona", "Oz On", "Ism Us", "Ned Usl","Sib De","Ay Us","Ay Dur","Em De","Fat Man"};

        for (int i = 0; i < classMates.length; i++) {
            String initials=classMates[i].charAt(0)+""+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(initials);
        }

    }

}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
