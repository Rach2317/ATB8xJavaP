package oct.ex14102024.abstractionexample;

public class Lab145 {

    public static void main(String[] args) {
        Son a = new Son();
        a.abstract50k();
        a.loan25k();  //here son is hiding load+n functions of father
    }
}
