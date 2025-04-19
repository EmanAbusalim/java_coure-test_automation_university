package chapter4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidateScanner {
    public static void main(String []args) {
      /*Scanner sc=new Scanner(System.in);
        int cut=0;
    try {
         cut= sc.nextInt();}
    catch(InputMismatchException e) {
                                    System.out.println("invalid input");
    sc.nextLine();}
try{
     while(cut<20){
         System.out.println("try another time");
        cut=sc.nextInt();
         }

    }
    catch (InputMismatchException e){
            System.out.println("invalid");
            sc.nextLine();
        }}*/
/// /////////////////////////////////////////////////////////
//enhanced one for validation
/*Scanner sc= new Scanner(System.in);    int number;
        System.out.println("enter a number");

while(true){

try{
    int num=sc.nextInt();
    if (num<20){
        System.out.println("there is less than 20 try again");

    }
    else{

    System .out.println("ok i get the num");
        break;}
}
catch(InputMismatchException E){
         System.out.println("try valid one ");
       sc.nextLine();
      continue;
}
            }}

    }*/
        // // //////////////////////////////////////////////////////////
        // another enhancment one
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    while(true){
        try{
            int c=sc.nextInt();
            if(c<20){
                System.out.println("try again");
            }
            else
                   break;
        } catch(InputMismatchException e){
            System.out.println("try valid one");
            sc.nextLine();
        }
    }





        sc.close();

    }}