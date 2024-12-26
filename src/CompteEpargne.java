import java.util.Scanner;

public class CompteEpargne extends  Compte{
    private double  tauxInteret ;

    public CompteEpargne(int Nrcompt, double solde, Client client, double tauxInteret) {
        super(Nrcompt, solde, client);
        this.tauxInteret =  tauxInteret;
    }
    public CompteEpargne() {
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
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne : " + super.toString() +
                "tauxInteret='" + tauxInteret + '\'' ;
    }


    public CompteEpargne createAccount() {
        Scanner scanner = new Scanner(System.in);
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

        return new CompteEpargne(Nrcompte, solde, foundClient,2);

    }




}
