package oct.ex16102024;

public class PrintMyBook extends Book{
    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }
   //rule if parent class has parameterized constructor then the extended class must also have a param. constr
    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);

    }
}
