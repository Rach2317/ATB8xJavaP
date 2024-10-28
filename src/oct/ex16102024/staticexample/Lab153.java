package oct.ex16102024.staticexample;

public class Lab153 {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(23);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
    }
}

class Student{
    int age;   //instance variable which is non static
    static  String school_name;  //static variable


    {
        System.out.println("IIB (instance initialization block)");
        System.out.println("Here u can write code of whatever u want do do while creation of the object");
        System.out.println("For eg Read of MySql db");
    }

    static {
        System.out.println("Static initialization block");
        System.out.println("Loaded only once class is loaded");
    }
    public Student(int age) {
        this.age = age;
    }
}
