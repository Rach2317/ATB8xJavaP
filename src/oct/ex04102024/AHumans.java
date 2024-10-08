package oct.ex04102024;

public class AHumans {
    String eyes_color;
    String names;
    long adhar_card_number;

    //default constructor
    AHumans()  //constructor
    {
        System.out.println("I will be called when object is created");
        //advantage of constructor is any code can be written in constructor will be called automatically when object is created
        // eg read a file
        //read a csv. excel here

    }

    //parameterized constructor
    AHumans(String name)
    {
        //parameterized constr can take the values at run time and assigns then to the instance variable
        System.out.println("Parameterized constructor");
    }


    void walk()
    {
        System.out.println("No return type no arguments");
    }

    int talk()
    {
        System.out.println("Return type with No argument");
        return 10;
    }

    String sleep(String name)
    {
        System.out.println("Sleeping");
        System.out.println("return type with argument");
        return  "I am sleeping";
    }

    void eat(String name)
    {
        System.out.println("Eat");
        System.out.println("No return type with argument");
    }




}
