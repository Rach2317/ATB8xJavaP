package oct.ex21102014.WrapperAndException;

public class Lab170_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0];  //taking arguments from cmd line (gives ArrayIndexOutOfException if input not given)
      /*  String ip1 = args[1];
        String ip2 = args[2];

        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);  */

        int a = Integer.parseInt(ip);             //NumberFormatException
        int b = 1000/a;     //ArithmeticException if a value 0
        System.out.println(b);
        System.out.println("End of program");

        //running process --
        //JVM gets initialized
        //creates and starts main thread - main called
        //1)collects CLI arguments - 10
        //string[] args = {10} - > 2)Lab170_Exception.main()
        //Now controll transfered from main thread to main method


        //Exception is event occured during execution of program that disrups the normal flow of instruction
        //exceptions can be handled using try catch blocks or using throws

        //Error is alos an event that disrups the execution but errors cannot be handled but exceptions can be handlled
        //eg of error is memory overflow


        //types of exception -

        // checked - If JVM knows about it (red)
        // unchecked - If JVM does not know about it (green)
    }
}
