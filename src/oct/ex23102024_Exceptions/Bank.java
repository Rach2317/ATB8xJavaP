package oct.ex23102024_Exceptions;

public class Bank {
    private  String currency;
    private  String amount;

    public Bank(String currency, String amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String add(Bank bankName)
    {
        return  bankName.amount + this.amount;
    }
}
