import java.util.List;
import java.util.Scanner;
public class Main {
    private static VisaCardManager VisaCardList;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        VisaCardList = new VisaCardManager();
        displayMenu();

    }

    private static void displayMenu() {
        while (true) {
            System.out.println("Select an option");
            System.out.println("1. create visaCard");
            System.out.println("2. delete a visaCard");
            System.out.println("3. credit to a visaCard");
            System.out.println("4. debit from a visaCard");
            System.out.println("5. exit");

            int option;
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {

                case 1:
                    createVisaCard();
                    break;
                case 2:
                    deleteVisaCard();
                    break;
                case 3:
                    creditAmount();
                    break;
                case 4:
                    debitAmount();
                    break;
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }

    private static void createVisaCard() {
        {
            System.out.println("Enter card type (silver/gold):");
            String cardType = scanner.nextLine();
            System.out.println("Enter card id");
            int id = scanner.nextInt();
            if (cardType.equalsIgnoreCase("silver")) {
                VisaCardList.createCard(new SilverVisaCard(id));
            } else if (cardType.equalsIgnoreCase("gold")) {
                VisaCardList.createCard(new GoldenVisaCard(id));
            } else {
                System.out.println("Please choose 'silver' or 'gold'.");
            }
        }
    }

    private static void deleteVisaCard() {
        System.out.println("Enter card id");
        int id = scanner.nextInt();
        List<VisaCard> visaCards = VisaCardList.getVisaCards();
        boolean cardFound = false;
        for (int i = 0; i < visaCards.size(); i++) {
            VisaCard card = visaCards.get(i);
            if (card.getID() == id) {
                visaCards.remove(i);
                cardFound = true;
                break;
            }
        }
        if (!cardFound) {
            System.out.println("No Visa card found with ID ");
        }
        else{
            System.out.println("Visa card deleted");
        }
    }

    private static void creditAmount() {
        System.out.println("Enter card id");
        int id = scanner.nextInt();
        System.out.println("Enter amount to be added:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        List<VisaCard> visaCards = VisaCardList.getVisaCards();
        boolean cardFound = false;
        for (int i = 0; i < visaCards.size(); i++) {
            VisaCard card = visaCards.get(i);
            if (card.getID() == id) {
                card.credit(amount);
                cardFound = true;
                break;
            }
        }
        if (!cardFound) {
            System.out.println("No Visa card found with ID ");
        }
    }
    private static void debitAmount() {
        System.out.println("Enter card id");
        int id = scanner.nextInt();
        System.out.println("Enter amount to be removed:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        List<VisaCard> visaCards = VisaCardList.getVisaCards();
        boolean cardFound = false;
        for (int i = 0; i < visaCards.size(); i++) {
            VisaCard card = visaCards.get(i);
            if (card.getID() == id) {
                card.debit(amount);
                cardFound = true;
                break;
            }
        }
        if (!cardFound) {
            System.out.println("No Visa card found with ID ");
        }
    }

}