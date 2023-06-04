import java.util.ArrayList;
import java.util.List;

public class VisaCardManager {
    private static ArrayList<VisaCard> visaCards;

    public List<VisaCard> getVisaCards() {
        return visaCards;
    }
    public VisaCard SearchVisaCard(int id){
        for(int i=0 ;i< visaCards.size(); i++){
            VisaCard visaCard_loop= visaCards.get( i);
            if(visaCard_loop.getID()==id)
                return visaCard_loop;
        }
            return null;
    }

        public void addVisaCard(VisaCard visaCard){
            visaCards.add(visaCard);
        }

        public void deleteVisaCard(VisaCard visaCard){
        visaCards.remove(visaCard);
    }
}
//create array that contains Visacards.