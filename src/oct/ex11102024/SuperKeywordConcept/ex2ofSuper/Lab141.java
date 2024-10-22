package oct.ex11102024.SuperKeywordConcept.ex2ofSuper;

public class Lab141 {
    public static void main(String[] args) {
        BaseClass t1 = new BaseClass();   //dynamic dispatch  referencee of parent class and object of child class
        t1.openBrowser();
        t1.closeBrowser();
    }
}
