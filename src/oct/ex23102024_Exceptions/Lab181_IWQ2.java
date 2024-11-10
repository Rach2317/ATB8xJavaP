package oct.ex23102024_Exceptions;

public class Lab181_IWQ2 {
    public static void main(String[] args) {
        final  double pie = 3.14;
        int a = 0;

        try { int x= 10/a;

        } catch (Exception e) {
            System.out.println("Divide by zero");
        } finally {
            System.out.println("I will be executed anyhow");
        }

    }
}
