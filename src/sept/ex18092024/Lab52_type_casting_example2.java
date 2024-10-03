package sept.ex18092024;

public class Lab52_type_casting_example2 {
    public static void main(String[] args) {
        //GST = 18.45
        int course =100;
        float GST = 18.45f;
       // int total_price  =  course+GST; //narrowing -implicit - JVM - invalid
      //  float total_price = course+GST;  //narrowing -implicit - JVM - invalid

        int total_price = course + (int)GST; //narrowing -explicit -data loss
        System.out.println(total_price);
    }
}
