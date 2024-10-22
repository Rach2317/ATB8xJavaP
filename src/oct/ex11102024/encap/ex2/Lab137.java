package oct.ex11102024.encap.ex2;

public class Lab137 {
    public static void main(String[] args) {
          ICICIBank rachna = new ICICIBank("Rachana",100000);

       //   rachna.setBalance(1000);   //but ideally this should be allowed to only admin
        // so this setBalance can be safe guarded by changing code

        boolean are_you_admin = true;
        ICICIBank sanket_Admin = new ICICIBank("Sanket_Admin",100);
        sanket_Admin.setBalance(5000,true);
        System.out.println(sanket_Admin.getName(are_you_admin));
    }
}
