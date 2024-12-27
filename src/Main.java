import jdk.dynalink.beans.StaticClass;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Client> clientArrayList = new ArrayList<>();
    static ArrayList<Compte> ComptArraylist = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
       while (!exit){

           System.out.println("\n--- Banking Application Menu ---");
            System.out.println("1. Manage Clients");
           System.out.println("2. Manage Accounts");
           System.out.println("3. Manage Operations");
           System.out.println("4. Exit");
           System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
               case 1:
                    manageClients(scanner);
                   break;
                case 2:
                   manageAccounts(scanner);
                    break;
               case 3:
                    //manageOperations(scanner);
                   break;
               case 4:
                  System.out.println("Exiting the application. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
       }
        scanner.close();
    }
    public static void manageClients(Scanner scanner) {
        Client client = new Client();
        boolean back = false;
        while (!back){

        System.out.println("\n--- Manage Clients ---");
        System.out.println("1. Add Client");
        System.out.println("2. Display Client List");
        System.out.println("3. Back to Main Menu");
        System.out.print("Select an option: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                clientArrayList.add(client.AddClient(scanner));
                break;
            case 2 :
                client.DisplayClient(clientArrayList);
            break;
            case 3 :
                back = true;
             break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

}
    }

    private static void manageAccounts(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- Manage Accounts ---");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Information");
            System.out.println("3. Back to Main Menu");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" 1- account courant ");
                    System.out.println(" 2- account epagne  ");
                    System.out.println("entre your choice : ");
                    int choix= scanner.nextInt();
                    if (choix==1){
                            CompteCourant courant = new CompteCourant();
                        ComptArraylist.add(courant.createAccount());

                    }else if(choix==2){
                        CompteEpargne epargne = new CompteEpargne();
                        ComptArraylist.add(epargne.createAccount());

                    }else{
                        System.out.println("Invalid choice !!");
                    }
                    break;
                case 2:
                    Compte.DisplayAccountInformation(ComptArraylist);
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
    private static void manageOperations(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- Manage Operations ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Display Operation History");
            System.out.println("5. Filter Operations");
            System.out.println("6. Back to Main Menu");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
//                    Performingdeposit();

                    break;
                case 2:
//                    Performingwithdrawal();

                    break;
                case 3:
//                    Performingtransfer();

                    break;
                case 4:
//                    Displayingoperation();
                    break;
                case 5:
//                    Filteringoperations();

                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }




}





















