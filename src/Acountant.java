public class Acountant extends Employee {
    private String accountantCertificateCode;
    public Acountant(String accountantCertificateCode,String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
        this.accountantCertificateCode = accountantCertificateCode;
    }
    public String getAccountantCertificateCode()
    {
        return accountantCertificateCode;
    }
    public boolean addAccountant( String accountantCertificateCode)
    {
        return super.addEmployee("accountant",accountantCertificateCode);
    }
    public boolean editAccountant( String accountantCertificateCode)
    {
        return super.editEmployee("accountant",accountantCertificateCode);
    }

}
