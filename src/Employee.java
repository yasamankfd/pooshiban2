public class Employee {
    private String name;
    private String lastname;
    private String address;
    private String Nid;
    private String phoneNumber;
    private String emailAddress;
    private int age;
    private boolean gender;
    public Employee(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender)
    {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.Nid = Nid;
        this.age = age;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public void EditInfo(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender)
    {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.Nid = Nid;
        this.age = age;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getLastname()
    {
        return lastname;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public String getNid()
    {
        return Nid;
    }
    public int getAge()
    {
        return age;
    }
    public boolean isGender()
    {
        return  gender;
    }
    public boolean addEmployee(String post,String certificate)
    {
        String gender ;
        if(this.isGender())
        {
            gender="woman";
        }else gender="man";
        String query = "insert into employee(Nid ,name ,lastname ,phoneNumber ,age ,gender ,address ,emailAddress ,post ,certificateCode ) values ( '"+Integer.parseInt(Nid)+"' , '"+name+"' , '"+lastname+"' ,' "+phoneNumber+"' , "+age+", '"+gender+"' , '"+address+"' , '"+emailAddress+"' , '"+post+"' , '"+certificate+"' );";
        return DataBase.addUser(query);
    }
    public boolean editEmployee(String post,String certificate)
    {
        String gender ;

        if(this.isGender())
        {
            gender="woman";
        }else gender="man";
        String query = "insert into employee(Nid ,name ,lastname ,phoneNumber ,age ,gender ,address ,emailAddress ,post ,certificateCode ) values ("+Integer.parseInt(Nid)+", '"+name+"' , '"+lastname+"' , '"+phoneNumber+"' ,"+age+", '"+gender+"' , '"+address+"' , '"+emailAddress+"' , '"+post+"' , '"+certificate+"' );";
        return DataBase.editUser(this.Nid,"employee","Nid",query);
    }
}
