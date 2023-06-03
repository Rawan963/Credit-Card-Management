import java.util.ArrayList;
import java.util.List;

public abstract class VisaCard {

    private String type;
    private double balance;

    public VisaCard(String type){
        this.type=type;
        this.balance=0.0;
    }
    public String getType(){
        return type;
    }



    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance) {
            this.balance = balance;
        }


    public abstract void credit(double amount);

    public abstract void debit(double amount);

}

