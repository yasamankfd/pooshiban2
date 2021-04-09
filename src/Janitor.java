public class Janitor extends Employee{

    public Janitor(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
    }

    public boolean addJanitor()
    {
        return super.addEmployee("janitor","");
    }
    public boolean editJanitor()
    {
        return super.addEmployee("janitor","");
    }
}
