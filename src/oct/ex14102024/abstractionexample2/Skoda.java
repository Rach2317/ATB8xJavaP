package oct.ex14102024.abstractionexample2;

public class Skoda extends Engine{

    void drive()
    {
        startEngine();
        stopEngine();
    }



    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");

    }
}
