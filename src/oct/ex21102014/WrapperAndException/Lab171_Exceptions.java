package oct.ex21102014.WrapperAndException;

import java.io.FileInputStream;

public class Lab171_Exceptions {
    public static void main(String[] args) {

        //eg of checked exception - (When JVM knows about it)
       // FileInputStream file = new FileInputStream("C://a.text");
        //JVM knows that this file may or may not exist

        //eg of unchecked exception - (JVM not aware) eg arithmeticexception

        int a = 10;
        int c = a/0;
        System.out.println(c);
    }
}
