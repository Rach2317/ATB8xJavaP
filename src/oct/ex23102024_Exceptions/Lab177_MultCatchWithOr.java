package oct.ex23102024_Exceptions;

public class Lab177_MultCatchWithOr {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End");
        }
    }
}
