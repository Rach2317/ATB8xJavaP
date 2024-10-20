package oct.ex09102024_Inheritance.Single_Inheritance.Polymorphism.methodoverriding.methodoverriding.realtime;

public class Runner1overriding {
    public static void main(String[] args) {
        Rachana r = new Rachana();
        r.home();


        //dynamic dispatch   // eg in selenium : Webdriver driver = new Chromedriver();

        Father f = new Rachana();
        f.home();

      //  Rachana f = new Father();   Not possible

    }
}
