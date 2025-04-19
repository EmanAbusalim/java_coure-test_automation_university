import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReadingClass {
    public static void main(String []args)throws Exception{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s=b.readLine();
        /**
        *
        * @pufferReader
         * */
        int i= Integer.parseInt( b.readLine().trim());
        System.out.println(5+i);
    }





}
