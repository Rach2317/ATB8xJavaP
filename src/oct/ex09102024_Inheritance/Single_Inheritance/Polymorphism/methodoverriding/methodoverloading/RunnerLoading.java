package oct.ex09102024_Inheritance.Single_Inheritance.Polymorphism.methodoverriding.methodoverloading;

public class RunnerLoading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();    //single object multiple types same name diff arguments

        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("Rachana","Sanket");
        System.out.println(name);
    }


}
