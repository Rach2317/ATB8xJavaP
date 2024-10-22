package oct.ex11102024.SuperKeywordConcept;

public class Lab139 {

    //super keyword in java is a reference variable that allows sub class (child class) to reference the parent class

    //1. Use of Super with variables
    //2. Use of super with methods
    //3. use of super with constructors


    public static void main(String[] args) {
        Car c = new Car();
    }


}

class Car extends Vehicle
{
    private int maxSpeed = 281;

    Car()
    {
        super(10);
        System.out.println("DC of Car!!");
        System.out.println(this.maxSpeed);
    }

}

class  Vehicle
{
    public int maxSpeed = 180;

    Vehicle()
    {
        System.out.println("Default Constructor Vehicle");
    }

    Vehicle(int a)
    {
        System.out.println("Parameterized Constructor vehicle");
    }

    void  message()
    {
        System.out.println("Hello vehicle");
    }

    void message(int a)
    {
        System.out.println("Hello vehicle");
    }
}








