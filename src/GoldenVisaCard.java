public class GoldenVisaCard extends VisaCard {
    public GoldenVisaCard() {
        super("Gold");
    }


    public void credit(double amount) {
        setBalance(this.getBalance() + amount);
        System.out.println("Gold " + amount + "was added Successfully new Balance :" + getBalance());
    }

    public void debit(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("No Sufficient abalance ");
        } else {
            setBalance(this.getBalance() - amount);
            System.out.println("Gold : " + amount + "was withdrawn successfully , new balance : " + getBalance());
        }
    }
}
