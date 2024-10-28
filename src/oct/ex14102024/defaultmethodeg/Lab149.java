package oct.ex14102024.defaultmethodeg;

public class Lab149 {
}


//default is the only method that can have body inside interface
//static methods (not class)can also have a body inside interface
interface I3
{
  default void start()
  {
      System.out.println("default can have Body!!");
  }

  static  void ss()
  {
      System.out.println("Static can also havve a body");
  }

  abstract class  AA{
      void f1()
      {
          System.out.println("concrete method");
      }
      abstract  void f2();

  }


}

