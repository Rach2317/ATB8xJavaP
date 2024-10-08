package oct.ex04102024;

public class Lab126 {
    public static void main(String[] args) {
        Dog_ParameterizedConstr gs = new Dog_ParameterizedConstr("GS", 2,4,"pluto");
        System.out.println(gs.breed);
        System.out.println(gs.age);
        System.out.println(gs.legs);
        System.out.println(gs.name);
        Dog_ParameterizedConstr bd = new Dog_ParameterizedConstr();
    }
}
