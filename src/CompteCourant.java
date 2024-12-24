public class CompteCourant extends Compte {
    private String fraisBancaires;

    public CompteCourant(int Nrcompt, String solde, Client client) {
        super(Nrcompt, solde, client);
        this.fraisBancaires = fraisBancaires;
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


    public String getFraisBancaires() {
        return fraisBancaires;
    }

    public void setFraisBancaires(String fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }

    @Override
    public String toString() {
        return "CompteCourant " + super.toString() +
                " fraisBancaires='" + fraisBancaires + '\'';
    }
}
