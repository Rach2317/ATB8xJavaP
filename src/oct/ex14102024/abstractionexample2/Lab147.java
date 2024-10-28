package oct.ex14102024.abstractionexample2;

public class Lab147 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
        //object of interface cannot be created I obj = new I(); [not allowed]
        //just remember abstract - extends
    }

}

class P implements I{
    @Override
    public void f1() {
        System.out.println("p");
    }
}

interface I {
    void f1();
}
