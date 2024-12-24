public class CompteEpargne extends  Compte{
    private double  tauxInteret ;

    public CompteEpargne(int Nrcompt, String solde, Client client) {
        super(Nrcompt, solde, client);
        this.tauxInteret =  tauxInteret;
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
    public String getSolde() {
        return super.getSolde();
    }

    @Override
    public void setSolde(String solde) {
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

}
