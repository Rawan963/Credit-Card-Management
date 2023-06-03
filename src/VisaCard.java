public abstract class VisaCard {
    private int id;
    private String type;
    private double balance;

    public VisaCard(String type,int id){
        this.type=type;
        this.id=id;
        this.balance=0.0;
    }
    public String getType(){
        return type;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance) {
            this.balance = balance;
        }


    public void credit(double amount, int id) {
        setBalance(this.getBalance()+amount);
    }

    public void debit(double amount,int id){
        if(amount>this.getBalance())
            return;
        setBalance(this.getBalance()-amount);
    }

}

 class SilverVisaCard extends VisaCard {
    public SilverVisaCard(int id) {
        super("Silver", id);
    }

 }