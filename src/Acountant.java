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
}
