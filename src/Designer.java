public class Designer extends  Employee{
    private String designerCertificateCode;
    public Designer(String name,String lastname,String address,String Nid,String phoneNumber,String emailAddress,int age,boolean gender,String designerCertificateCode)
    {
        super(name,lastname,address,Nid,phoneNumber,emailAddress,age,gender);
        this.designerCertificateCode = designerCertificateCode;
    }
    //undone
    public String getDesignerCertificateCode(){ return designerCertificateCode; }
}
