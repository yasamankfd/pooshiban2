import java.util.Date;

public class Customer {
    private int id;
    private String name;
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
    private String lastname;
    private String companyNAme;
    private boolean type;

    public Customer(int id, String name, String password, String email, String username, int phoneNumber, String address, int age, Date dateOfBirth, boolean gender, String lastname, String companyNAme , boolean type) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.companyNAme = companyNAme;
        this.type = type;
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

    public boolean getType() { return type;}

    public boolean addCustomer()
    {
        String gender , type;
        if(this.isGender())
        {
            gender="woman";
        }else gender="man";
        if(this.getType())
        {
            type="yes";
        }else type="no";
        return DataBase.insert("insert into custumer(Cid,name,lastname,password,username,email,phoneNumber,address,age,gender,homeCustomer,compName) vlues ( "+id+" , '"+name+"' , '"+lastname+"' , '"+password+"' , '"+username+"' , '"+email+"' , '"+phoneNumber+"' , '"+address+"' , "+Integer.toString(age)+" , '"+gender+"' , '"+type+"' , '"+companyNAme+"' );"  );
    }
    public boolean editCustomer()
    {
        return DataBase.edit("delete from customer where cid = "+id+";","insert into custumer(Cid,name,lastname,password,username,email,phoneNumber,address,age,gender,homeCustomer,compName) vlues ( "+id+" , '"+name+"' , '"+lastname+"' , '"+password+"' , '"+username+"' , '"+email+"' , '"+phoneNumber+"' , '"+address+"' , "+Integer.toString(age)+" , '"+gender+"' , '"+type+"' , '"+companyNAme+"' );" );
    }
    public boolean delete()
    {
        return DataBase.deleting("delete from customer where cid = "+id+";");
    }

}
