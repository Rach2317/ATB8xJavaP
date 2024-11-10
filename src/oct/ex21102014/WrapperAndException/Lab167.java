package oct.ex21102014.WrapperAndException;

public class Lab167 {
    public static void main(String[] args) {
        //primitive values can be converted into wrapper classes
        int a = 10;
        Integer b = a;    //boxing (integer --> Integer)
        System.out.println(b);
        //now using b as b. we can use  java functions(behaviors)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;   //capital integer means wrapper that allows use some extra functions
        int value = a2;   //unboxing-means when we assign premetive value (Integer --> integer)then wrapper gets removed
        System.out.println(value);

        //wrapper classes allows primitive datatypes to be treated as an objects with attribute and behavior

    }
}
