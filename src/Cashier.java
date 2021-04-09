public class Cashier extends Employee {

    public Cashier(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
    }
    public boolean addCashier()
    {
        return super.addEmployee("cashier","");
    }
    public boolean editCashier()
    {
        return super.addEmployee("cashier","");
    }

}