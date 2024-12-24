public class Compte {
    private int Nrcompte ;
    private String solde;
    private  Client client;


    public Compte (int Nrcompt, String solde, Client client){

    }

    public int getNrcompte() {
        return Nrcompte;
    }

    public void setNrcompte(int nrcompte) {
        Nrcompte = nrcompte;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
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
}
