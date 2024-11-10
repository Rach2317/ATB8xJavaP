package oct.ex25102024_Arrays;

import java.util.Arrays;

public class Lab188_Arrays {

    //Arrays - has same data type (homogeneous)

    public static void main(String[] args) {

        int[] marks = {51,100,91,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        //System.out.println(marks[5]);

        //other way to declare array

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int[] marks_2 = new int[5];
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
      //  System.out.println(marks[5]);

        //other good way to print

        for(int i = 0;i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        int item = Arrays.binarySearch(marks,51);
        System.out.println(item);


    }
}
