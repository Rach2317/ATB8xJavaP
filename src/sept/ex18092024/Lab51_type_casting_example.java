package sept.ex18092024;

public class Lab51_type_casting_example {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
      //  short s = phone_no; //invalid //narrowing implicit - JVM
        short s1 = (short) phone_no; //Narrowing explicit valid but with loss of data
        System.out.println(s1);
    }
}
