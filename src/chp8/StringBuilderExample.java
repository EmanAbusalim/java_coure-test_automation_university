package chp8;

public class StringBuilderExample {




    public static void main(String []args){
        String s="IamEmanAndISufferFromMyself!";
        addspaces(s);


    }

    public static void addspaces(String s){
        StringBuilder ss=new StringBuilder(s);
        for(int x=0;x<s.length();x++) {
/**
 * how touse methods in string builder
 *
 * */
            if (x != 0 && Character.isUpperCase(ss.charAt(x))) {
                ss.insert(x, " ");
                // we add the x++ to avoid start the seconed iteration with the same upper case and adding another space at the same place
                x++;
            }

        }

            System.out.print(ss);




    }
}
