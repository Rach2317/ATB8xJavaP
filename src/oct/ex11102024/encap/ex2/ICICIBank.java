package oct.ex11102024.encap.ex2;

public class ICICIBank {
    private String name;
    private long balance;


    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName(boolean isAdmin) {
        if (isAdmin) {
            return name;
        }
        else
        return null;
    }


    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }
   //setBalance can be safe guarded by changing code
    public void setBalance(long balance,boolean isAdmin) {
        if (isAdmin)
        {
            this.balance = balance;
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed!!");
        }

    }
}
