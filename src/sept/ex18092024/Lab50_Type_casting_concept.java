package sept.ex18092024;

public class Lab50_Type_casting_concept {
    public static void main(String[] args) {
        //type casting = source and destination conversion
        // types  - 1. widening (implicit,explicit) lossless   2. Narrowing (implicit,explicit) has loss


        //widening
        byte b = 10;
        int a = b;   //valid  - implicit casting  - JVM
        int a1 = (int)b;  //valid  - explicit casting - JVM

        //narrowing
        int val = 200;
        // byte b1 = val; //invalid implicit casting - JVM
        byte b2 = (byte) val; //invalid implicit casting  - loss of data
        System.out.println(b2);
    }
}
