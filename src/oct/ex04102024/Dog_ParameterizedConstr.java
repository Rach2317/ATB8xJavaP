package oct.ex04102024;

public class Dog_ParameterizedConstr {
    String name;
    int age;
    int legs;
    String breed;

    //default constructor
    Dog_ParameterizedConstr(){
        System.out.println("I am default constr");
    }

    //parameterized constr

    Dog_ParameterizedConstr(String breed)
    {
        System.out.println("I am paramterized constructor");
        this.breed = breed;
    }

    Dog_ParameterizedConstr(String breed,int age,int legs,String name)
    {
        System.out.println("GS");
        this.age = age;
        this.legs = legs;
        this.name = name;
    }





void walk()
{}




}
