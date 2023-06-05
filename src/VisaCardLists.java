import java.util.ArrayList;

public class VisaCardLists {
    private ArrayList<VisaCardManager> vc;

    public VisaCardLists() {
        vc = new ArrayList<>();
    }

    public void addVisa(VisaCardManager v) {
        vc.add(v);
    }

    public void distructVisaCard(VisaCardManager v) {
        vc.remove(v);
    }


}
