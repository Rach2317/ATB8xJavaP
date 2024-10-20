package oct.ex09102024_Inheritance.Single_Inheritance.Concept_Has_A_Aggrigation;

public class Car {
    //Has a relationship - Car has an engine
    //i has a we create instances and in is a we extends
    void startCar()
    {
        new Engine().start();
        new Tyre().rolling();
    }

}
