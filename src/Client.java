public class Client {

    private  int Id;
    private String firstname;
    private String lastname;
    private String email ;
    private int phone;

    public Client(int Id, String firstname, String lastname, String email , int phone){
        this.Id = Id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;


    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
