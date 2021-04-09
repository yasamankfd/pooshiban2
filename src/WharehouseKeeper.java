public class WharehouseKeeper extends Employee{

    public WharehouseKeeper(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender,String tailoringCertificateCode)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
    }
    public void inserNewtLoad(){

    }
    public void insertDepartedLoad(){

    }
    public void showLoadsInfo(){
    }

    public boolean addWharehouseKeeper()
    {
        return super.addEmployee("wharehouseKeeper","");
    }
    public boolean editWharehouseKeeper()
    {
        return super.addEmployee("wharehouseKeeper","");
    }
}
