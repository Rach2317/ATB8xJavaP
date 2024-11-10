package oct.ex23102024_Exceptions;

public class Lab176_Multicatch {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");

        }
        }

    }

