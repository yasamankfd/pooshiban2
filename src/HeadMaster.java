public class HeadMaster {
    private String name;
    private String lastname;
    private String address;
    private String Nid;
    private String phoneNumber;
    private String emailAddress;
    private int age;
    private boolean gender;
    private String degree;
    private String HeadMasterCode;
    public HeadMaster(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender , String headMasterCode , String degree)
    {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.Nid = Nid;
        this.age = age;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.HeadMasterCode = headMasterCode;
        this.degree = degree;
    }
    public void EditInfo(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender,String headMasterCode , String degree)
    {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.Nid = Nid;
        this.age = age;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.HeadMasterCode = headMasterCode;
        this.degree = degree;
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
    public String getDegree()
    {
        return degree;
    }
    public String getHeadMasterCode()
    {
        return HeadMasterCode;
    }
}
