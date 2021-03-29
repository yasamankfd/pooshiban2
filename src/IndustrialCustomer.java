import java.util.Date;

public class IndustrialCustomer extends Customer{

    public IndustrialCustomer(int id, String name, String password, String email, String username, int phoneNumber, String address, int age, Date dateOfBirth, boolean gender, int nationalId, String nationality) {
        super(id, name, password, email, username, phoneNumber, address, age, dateOfBirth, gender, nationalId, nationality);
    }
}
