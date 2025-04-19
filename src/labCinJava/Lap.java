package labCinJava;

import javax.swing.text.StyleContext;
import java.util.Scanner;

public class Lap {
public static void main(String[] args){
    int max= 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter number of integers");
    int n= sc.nextInt();
    int[] arr ={0};
    for(int i=1;i<n;i++){
        System.out.println("please enter integer number"+i);
        arr[i-1]= sc.nextInt();
        if(arr[i-1]>max){
            max=arr[i-1];
        }
    }
    System.out.println("this"+max);


}
}
