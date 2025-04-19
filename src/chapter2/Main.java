package chapter2;
import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        System.out.println("please enter the season of the year");
        Scanner sc= new Scanner(System.in);
        String season=sc.next();
        System.out.println("please enter the whole number") ;
        int wholeNumber=sc.nextInt();
           sc.nextLine();
        System.out.println("please enter the objective");
       // Scanner v=new Scanner(System.in);
        String adjective=sc.next();
        System.out.println("on "+adjective+season+" i drink a "+wholeNumber+" of tea");
        /*int wholeNumber=sc.nextInt();
        System.out.println();*/
;


    }
}
