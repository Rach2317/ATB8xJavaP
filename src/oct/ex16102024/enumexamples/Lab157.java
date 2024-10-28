package oct.ex16102024.enumexamples;

public class Lab157 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());

    }
}

enum  Color{
    RED("#FF000"),
    GREEN("#43234"),
    BLUE("#FF45");

        private String hexcode;

    private Color(String hexcode)
    {
        this.hexcode = hexcode;
    }

    public  String getHexcode()
    {
        return this.hexcode;
    }



}
