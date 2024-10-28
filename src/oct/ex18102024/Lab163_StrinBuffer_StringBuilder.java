package oct.ex18102024;

public class Lab163_StrinBuffer_StringBuilder {
    public static void main(String[] args) {
          //string buffer and builder used to create mutable strings
        //mutable strings are required for efficient string manipulations like appending ,inserting,deleting chars from string

       // String s = "Rach";
       // s = "Chhoti";     //in this case 2 strings will be created

        StringBuffer stringBuffer = new StringBuffer("Rach");
        stringBuffer.append("Ganachari");

        //if used stringbuffer, then only 1 string will be created  and hence gets mutable


        StringBuilder sb = new StringBuilder();
        sb.append("World");
        System.out.println(sb);

        //insert into stringbuilder

        sb.insert(5,",");
        System.out.println(sb);

        sb.reverse();


    }
}
