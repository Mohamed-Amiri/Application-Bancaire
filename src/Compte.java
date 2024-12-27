import java.util.ArrayList;

public abstract class Compte {
    private int Nrcompte ;
    private double solde;
    private  Client client;


    public Compte (int Nrcompte, double solde, Client client){
        this.Nrcompte = Nrcompte ;
        this.solde = solde;
        this.client = client;


    }

    public Compte() {

    }

    public int getNrcompte() {
        return Nrcompte;
    }

    public void setNrcompte(int nrcompte) {
        Nrcompte = nrcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return
                "Nrcompte=" + Nrcompte +
                ", solde='" + solde + '\'' +
                ", Propreitaire = \n " + client.getFirstname() +" "+client.getLastname() ;
    }
    public static void DisplayAccountInformation(ArrayList<Compte> comptes){

        for(Compte compte : comptes){
            System.out.println(compte.toString());
        }
    }

}
