package oct.ex23102024_Exceptions;

public class Lab183_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR","1000");
        Bank icici = new Bank("INR","1000");

        System.out.println(sbi.add(icici));


    }
}
