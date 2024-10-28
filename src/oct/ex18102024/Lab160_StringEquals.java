package oct.ex18102024;

public class Lab160_StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";  //this will be created in string const pool
        String s4 = "Hello";
        String s2 = new String("Hello"); // this will be created in object area
        String s3 = new String("Hello");
        String s5 = new String("hello");


        //Note : When u create a string literal, the JVM checks the "String const pool" forst
        //..to see if  an identical string already exists. If it does, it returns a reference to
        //..that instance : otherwise  it creates a new one

        System.out.println(s1 == s2);  //will give false bcz both created at diff locations
        System.out.println( s2 == s3); // will also return false ( == ) checks for reference locations
        System.out.println(s1 == s4);

        //so to check values .equals is used

        System.out.println(s1.equals(s2));    //will give true
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s5));

        //to ignore case sensitivity -

        System.out.println(s1.equalsIgnoreCase(s5));

        //so in string "==" checks for the reference and ".equals" checks for the values

    }
}
