public abstract class VisaCard {
    private int id;
    private String type;
    private double balance;

    public String getType(){
        return type;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public abstract void CreateCard(String type,int id);

    public abstract void credit(double amount,int id);

    public abstract void debit(double amount,int id);

    public abstract void DeleteCard(double amount,int id);
}


