package oct.ex18102024;

public class Lab162_StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat("World");  //op will be only hello bcz original string will always be same
        System.out.println(s1);
    }
}
