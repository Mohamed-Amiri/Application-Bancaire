import java.util.ArrayList;
import java.util.Scanner;

public abstract class Compte {
    private int Nrcompte ;
    private double solde;
    private  Client client;


    public Compte (int Nrcompt, double solde, Client client){
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
                ", client= " + client ;
    }
    public  void DisplayAccountInformation (ArrayList<Compte> comptes){

        for(int i = 0; i<comptes.size();i++){
            System.out.println(comptes.get(i).toString());
        }
    }

}
