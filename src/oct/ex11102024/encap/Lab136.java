package oct.ex11102024.encap;

public class Lab136
{
    public static void main(String[] args) {
        QDMSLogin q = new QDMSLogin("Admin","password");   ////encapsulation is data hiding for security purpose
        System.out.println(q.password);
    }
}
