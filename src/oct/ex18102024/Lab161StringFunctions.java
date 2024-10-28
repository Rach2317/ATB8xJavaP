package oct.ex18102024;

public class Lab161StringFunctions {

    public static void main(String[] args) {
        String str = "Hello World";

        //javap in cmd is like help comd which shows all the functions in the package

        //length of the String
        System.out.println("Length:"+str.length());

        //to find substring
        System.out.println("Substring"+str.substring(1,5));

        //trim
        System.out.println("Trimmed: ' " +str.trim() + "'");

        //convert to uppercase
        System.out.println("uppercase " +str.toUpperCase());

        //convert to lowercase
        System.out.println("Lowercase " +str.toLowerCase());

        System.out.println(str.charAt(0));
        System.out.println(str.equals("Hello"));

        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));

        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name = "Rach";
        String name2 = "Rach";

        System.out.println(name.compareTo(name2));  //returns 0 if both same

        //strings can be represeneted in following forms
        // 1. String class 2. StringBuffer 3. StringBuilder 4. Array of characters 5. Array list of chars
    }
}
