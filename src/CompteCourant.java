import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    private double fraisBancaires;

    public CompteCourant(int Nrcompt, double solde, Client client, double fraisBancaires) {
        super(Nrcompt, solde, client);
        this.fraisBancaires = fraisBancaires;
    }

    Scanner scanner = new Scanner(System.in);

    public CompteCourant() {
        super();
    }

    @Override
    public int getNrcompte() {
        return super.getNrcompte();
    }

    @Override
    public void setNrcompte(int nrcompte) {
        super.setNrcompte(nrcompte);
    }

    @Override
    public double getSolde() {
        return super.getSolde();
    }

    @Override
    public void setSolde(double solde) {
        super.setSolde(solde);
    }

    @Override
    public Client getClient() {
        return super.getClient();
    }

    @Override
    public void setClient(Client client) {
        super.setClient(client);
    }


    public double getFraisBancaires() {
        return fraisBancaires;
    }

    public void setFraisBancaires(double fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }

    @Override
    public String toString() {
        return "CompteCourant " + super.toString() +
                " fraisBancaires='" + fraisBancaires + '\'';
    }


    public CompteCourant createAccount() {
        System.out.println("enter the number of compte :");
        int Nrcompte = scanner.nextInt();
        System.out.println("enter solde : ");
        double solde = scanner.nextDouble();
        System.out.println("enter a client id");
        // find client by id
        int clientId = scanner.nextInt();
        scanner.nextLine();

        Client foundClient = null;
        for ( Client client : Main.clientArrayList ) {
            if ( client.getId() == clientId ) {
                foundClient = client;
                break;
            }
        }

        if(foundClient != null){
            CompteCourant newAccount = new CompteCourant(Nrcompte, solde, foundClient, 20);
            return newAccount;
        }else {
            System.out.println("client not found");
            return null;
        }



    }

}