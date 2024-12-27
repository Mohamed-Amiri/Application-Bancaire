import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private  int Id;
    private String firstname;
    private String lastname;
    private String email ;
    private int phone;
    private ArrayList<Compte> comptes = new ArrayList<>();

    public Client(int Id, String firstname, String lastname, String email , int phone){
        this.Id = Id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;

    }

    public Client() {

    }

    @Override
    public String toString() {
        return "Client :" +
                "Id=" + Id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone ;
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
    public void setComptes ( Compte compte ) {
        this.comptes.add( compte );
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


    public Client AddClient(Scanner scanner){
        System.out.println("enter ID : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("enter firstname : ");
        String firstname = scanner.nextLine();
        System.out.println("enter lastname : ");
        String lastname = scanner.nextLine();

        System.out.println("enter email : ");
        String email = scanner.nextLine();
        System.out.println("enter phone number : ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        return new Client(id,firstname, lastname, email, phone);
    }

public  void DisplayClient (ArrayList<Client> client){

        for(int i = 0; i<client.size();i++){
            System.out.println(client.get(i).toString());
        }
}
    public void methodregex (String input,String regex){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.matches(regex)) {
                break;
            }
            else {
                System.out.println("input invalid !!!!!! ");
            }

        }

    }
}
