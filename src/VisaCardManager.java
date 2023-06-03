import java.util.ArrayList;
import java.util.List;

public class VisaCardManager {
    private static List<VisaCard> visaCards;

    public VisaCardManager() {
        this.visaCards = new ArrayList<>();
    }

    public static void createCard(VisaCard VisaCardname) {
        visaCards.add(VisaCardname);
        System.out.println("Visa card created ");
    }


    public List<VisaCard> getVisaCards() {
        return visaCards;
    }

}
