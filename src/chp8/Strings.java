package chp8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Strings {
    public static void main(String[]args){
        Strings b=new Strings();
        Scanner input=new Scanner(System.in);
        System.out.println("enter String");
        String text= input.next();
        String []arr = new String[text.length()];
        arr=b.lookToString(text);
        for(int i=0;i<text.length();i++){
      System.out.println( arr[i]);
    }}

    public String [] lookToString(String x){
        String [] y= x.split(" ");
return y;
    }
}
