public class SalesUnitManager extends Employee{
    public SalesUnitManager(String name, String lastname, String address, String Nid, String phoneNumber, String emailAddress, int age, boolean gender)
    {
        super(name, lastname, address, Nid, phoneNumber, emailAddress, age, gender);

    }
    public boolean addsalesManager()
    {
        return super.addEmployee("sales unit manager","");
    }
    public boolean editsalesManager()
    {
        return super.addEmployee("sales unit manager","");
    }
    }
