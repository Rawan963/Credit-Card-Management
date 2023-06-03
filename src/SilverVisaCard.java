public class SilverVisaCard extends VisaCard {
    public SilverVisaCard(int id) {
        super("Silver", id);
    }

    public void credit(double amount) {
        setBalance(this.getBalance() + amount);
        System.out.println("Silver " + amount + "was added Successfully new Balance :" + getBalance());
    }

    public void debit(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("No Sufficient abalance ");
        } else {
            setBalance(this.getBalance() - amount);
            System.out.println("Silver : " + amount + "was withdrawn successfully , new balance : " + getBalance());
        }
    }
}
