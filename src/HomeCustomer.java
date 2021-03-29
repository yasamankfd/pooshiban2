import java.util.Date;

public class HomeCustomer extends Customer{

    private int HomeCustomerId;

    public HomeCustomer(int id, String name, String password, String email, String username, int phoneNumber, String address, int age, Date dateOfBirth, boolean gender, int nationalId, String nationality, int HomeCustomerId) {
        super(id, name, password, email, username, phoneNumber, address, age, dateOfBirth, gender, nationalId, nationality);
        this.HomeCustomerId = HomeCustomerId;
    }
}
