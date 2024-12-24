public class Operation {
    String type;
    String operation;
    int montant ;
    int  date ;

    public Operation(String type, String operation, int montant, int date) {
        this.type = type;
        this.operation = operation;
        this.montant = montant;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation : " +
                "type='" + type + '\'' +
                ", operation='" + operation + '\'' +
                ", montant=" + montant +
                ", date=" + date ;
    }
}
