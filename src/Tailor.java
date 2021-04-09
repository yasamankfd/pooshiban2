public class Tailor extends Employee{
    private String tailoringCertificateCode;
    public Tailor(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender,String tailoringCertificateCode)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
        this.tailoringCertificateCode = tailoringCertificateCode;
    }
    public void insertNewClothe()
    {

    }
    public void editClothe()
    {

    }
    public void showClothe()
    {

    }
    public boolean addTailor(String tailoringCertificateCode)
    {
        return super.addEmployee("tailor",tailoringCertificateCode);
    }
    public boolean editTailor(String tailoringCertificateCode)
    {
        return super.addEmployee("tailor",tailoringCertificateCode);
    }
}
