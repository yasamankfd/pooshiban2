import java.sql.Time;
import java.util.Date;

public class Transaction {
    private String code;
    private Date date;
    private Time time;
    private String benefactor;
    private String payer;
    private Integer payment;
    private int numOfProducts;

    public Transaction(String Code,Date date,Time time,String benefactor,String payer,Integer payment,int numOfProducts)
    {
        this.code = Code;
        this.benefactor = benefactor;
        this.date = date;
        this.time = time;
        this.numOfProducts = numOfProducts;
        this.payer = payer;
        this.payment = payment;
    }
    public String getCode() { return code; }
    public String getBenefactor() { return benefactor; }
    public String getPayer() { return payer; }
    public Date getDate(){ return date; }
    public Time getTime(){ return time; }
    public Integer getPayment(){ return payment; }
    public int getNumOfProducts(){ return  numOfProducts; }
}
