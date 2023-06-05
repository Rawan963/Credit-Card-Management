
import java.util.ArrayList;
import java.util.Scanner;


        public class Main {
            private static Scanner scanner = new Scanner(System.in);
             static VisaCardManager visaCardL = new VisaCardManager();


            public static void main(String[] args) {
            displayMenu();


        }
        private static void displayMenu() {
                int choice;

            while (true) {
                System.out.println("Select an option");
                System.out.println("1. create visaCard");
                System.out.println("2. delete a visaCard");
                System.out.println("3. credit to a visaCard");
                System.out.println("4. debit from a visaCard");
                System.out.println("5. exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {

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

            private static void debitAmount() {
                System.out.println("Enter the ID of the visa card:");
                int id = scanner.nextInt();
                scanner.nextLine();
                VisaCard v=visaCardL.SearchVisaCard(id);
                if(v== null){
                    System.out.println("Visa card of this id doesn't exists");
                }
                else{
                    System.out.println("Enter the balance you want to debit from the visa card ");
                    double balance = scanner.nextInt();
                    scanner.nextLine();


                    String t=v.getType();
                    if(t.equalsIgnoreCase("Silver")){
                        SilverVisaCard s= (SilverVisaCard) v;
                        s.debit(balance);
                    } else if  (t.equalsIgnoreCase("Gold")){
                        GoldenVisaCard g= (GoldenVisaCard) v;
                        g.debit(balance);
                    }else {
                        System.out.println("type not valid");
                    }

                }}

            private static void creditAmount() {
                System.out.println("Enter the ID of the visa card:");
                int id = scanner.nextInt();
                scanner.nextLine();
                VisaCard v=visaCardL.SearchVisaCard(id);
                if(v== null){
                    System.out.println("Visa card of this id doesn't exists");
                }
                else{
                System.out.println("Enter the balance you want to add to the visa card ");
                double balance = scanner.nextInt();
                scanner.nextLine();


                String t=v.getType();
                if(t.equalsIgnoreCase("Silver")){
                    SilverVisaCard s= (SilverVisaCard) v;
                    s.credit(balance);
                } else if  (t.equalsIgnoreCase("Gold")){
                    GoldenVisaCard g= (GoldenVisaCard) v;
                    g.credit(balance);
                }else {
                    System.out.println("type not valid");
                }

            }}


            private static void createVisaCard() {
                System.out.println("Creating a visa card");
                System.out.println("Enter the type of the visa card (Silver/Gold):");
                String type = scanner.nextLine();
                System.out.println("Enter the ID of the visa card:");
                int id = scanner.nextInt();
                scanner.nextLine();
                VisaCard v=visaCardL.SearchVisaCard(id);
                if (v!=null) {
                System.out.println("VisCard with this Id already exists");}
                else{
                if (type.equalsIgnoreCase("Silver")) {
                   SilverVisaCard silverVisaCard=new SilverVisaCard(id);
                    visaCardL.addSilverVisaCard(silverVisaCard);
                        System.out.println("Silver Visa Card created with ID: " + id);
                    } else if (type.equalsIgnoreCase("Gold")) {
                        GoldenVisaCard goldenVisaCard = new GoldenVisaCard(id);
                        visaCardL.addGoldenVisaCard(goldenVisaCard);
                        System.out.println("Gold Visa Card created with ID: " + id);
                    } else {
                        System.out.println("Invalid visa card type. Please try again.");
                    }}

                }


                private static void deleteVisaCard() {
                    System.out.println("Deleting a visa card");
                    System.out.println("Enter the ID of the visa card:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    VisaCard v=visaCardL.SearchVisaCard(id);
                    if (v != null) {
                          visaCardL.deleteVisaCard(v);

                        System.out.println("Visa card with ID " + id + " deleted successfully.");
                    } else {
                        System.out.println("No Visa Card found with ID " + id);
                    }
                }
            }