package oct.ex14102024.interfaceexample;

public class Lab148 {
    public static void main(String[] args) {

        ABC obj = new ABC();
        obj.f4();      //abstraction achieved via interface

    }

}

class  ABC implements I1,I2{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}


interface I1{
    void f1();
    void f2();
}

interface I2{
    void f3();
    void f4();
}
