package oct.ex21102014.WrapperAndException;

public class Lab173_Exception {
    public static void main(String[] args) {

        //unchecked exception - NullPointerException
        //JVM finds at run time and terminates program
        String s1 = null;
        System.out.println(s1.trim());
    }
}
