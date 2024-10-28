package oct.ex16102024;

public class Lab152 {
    public static void main(String[] args) {
      //  Book book = new Book;  Not possible bcz objects cannot be created in abstract class

        Book book = new PrintMyBook("Rachana","RG",1000); //but we can create of printMybook class(dynamic dispatch/casting)
        book.getDetails();
    }
}
