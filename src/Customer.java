import java.util.Date;

public class Customer {
    private int id;
    public String name;
    private String password;
    private String username;
    private String email;
    private int phoneNumber;
    private String address;
    private int age;
    private Date dateOfBirth;
    private boolean gender;
    private int nationalId;
    private String nationality;

    public Customer(int id, String name, String password, String email, String username, int phoneNumber, String address, int age, Date dateOfBirth, boolean gender, int nationalId, String nationality) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationalId = nationalId;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public int getNationalId() {
        return nationalId;
    }

    public String getNationality() {
        return nationality;
    }

}
