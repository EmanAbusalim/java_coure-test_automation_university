package chapter4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ForLoopString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("please enter the word you want");
                String word = sc.next();
                for (int i = 0; i < word.length(); i++) {
                    char x = word.charAt(i);
                    if (x == 'A' || x == 'a') {
                        System.out.println("i found it! it is the charachter number" + (i + 1));
                        break;
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("uh oh! invalid input");
                sc.nextLine();
            }

        }
    }
}