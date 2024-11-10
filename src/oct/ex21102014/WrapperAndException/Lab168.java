package oct.ex21102014.WrapperAndException;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a;  // unboxing

        //string to primitive

        int a3 = Integer.parseInt(num);

        //wrapper classes allows primitive datatypes to be treated as an objects with attribute and behavior
        //(just like the upgraded version of primitive datatypes)
        //in collection framework you can only use class and objects (cannot use any primitive variables)

    }
}
