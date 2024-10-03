package sept.ex16092024;

public class Lab33_IWQnA {
    public static void main(String[] args) {
       String first_name = "Rachana";
       String last_name = "Ganachri";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);  //if strings are there first in concate operator then the operators coming after strings will be treated as strings only so output will be RachanaGanachari1010
        System.out.println(a + b +first_name + last_name);   // if operators coming before strings then output will be 20RachanaGanachari
    }
}
