package oct.ex11102024.encap.AccessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrcop = new Cop(20);
       // System.out.println(jrcop.gun);
        jrcop.canIShoot();
    }
}
