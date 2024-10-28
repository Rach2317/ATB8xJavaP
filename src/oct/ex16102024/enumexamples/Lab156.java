package oct.ex16102024.enumexamples;

public class Lab156 {
    public static void main(String[] args) {
        //enum are special types of datatypes that allows you to store constants into them
        //whatever api values(constants) or any key value pairs we can store into enums
        System.out.println(Day.Saturday);
    }
}

enum Day{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
