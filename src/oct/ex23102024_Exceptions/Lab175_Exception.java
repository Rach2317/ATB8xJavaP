package oct.ex23102024_Exceptions;

public class Lab175_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            int c = 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
