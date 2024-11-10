package oct.ex21102014.WrapperAndException;

public class Lab174_Exception {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/c;
            String s1 = null;
            s1.trim();

            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
