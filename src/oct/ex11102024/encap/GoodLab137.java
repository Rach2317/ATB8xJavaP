package oct.ex11102024.encap;

public class GoodLab137
{
    public static void main(String[] args) {
        GoodQDMSLogin g = new GoodQDMSLogin("Admin","Password");
      //  System.out.println(g.password);   //cannot access variables as they are private now

        //if you want to change you can change within its scope only using getter setters


        //check if admin

        System.out.println(g.getPassword());

        boolean isAdmin = false;

        g.setPassword("newpassword",isAdmin);
        System.out.println(g.getPassword());


    }
}
