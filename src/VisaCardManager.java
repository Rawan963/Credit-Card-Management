import java.util.ArrayList;
import java.util.List;

public class VisaCardManager {
    private List<VisaCard> visaCards;

    public VisaCardManager() {
        this.visaCards = new ArrayList<>();
    }

    public void createCard(VisaCard VisaCardname) {
        visaCards.add(VisaCardname);
        System.out.println("Visa card created ");
    }
    public void deleteCard(VisaCard VisaCardname){
        visaCards.remove(VisaCardname);
        System.out.println("Visa card deleted ");
    }
    public void creditCard(VisaCard visaCard, double amount) {
        visaCard.credit(amount);
    }
    public void debitCard(VisaCard visaCard, double amount) {
        visaCard.debit(amount);
    }
    public List<VisaCard> getVisaCards() {
        return visaCards;
    }

}