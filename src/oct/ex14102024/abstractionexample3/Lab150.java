package oct.ex14102024.abstractionexample3;

public class Lab150 {

}
interface I1{}
interface  I2{}

class A{}    //concrete class
class B{}

class Test1 extends A{}
//class Test2 extends A,B{}   //multiple inheritance never possible in case of classes

class Test3 implements I1{}

class Test4 implements I1,I2{}

class Test5 extends  A implements I1,I2{}



