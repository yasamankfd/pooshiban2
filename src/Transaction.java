import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Time;
import java.util.Date;

public class Transaction {
    private String code;
    private String loadCode;
    private String payerId;
    private Date date;
    private Time time;
    private String benefactor;
    private String payer;
    private Integer payment;
    private int numOfProducts;
    private String invoiceCode;

    public Transaction(String Code,Date date,Time time,String benefactor,String payer,Integer payment,int numOfProducts,String loadCode,String payerId ,String invoiceCode)
    {
        this.code = Code;
        this.benefactor = benefactor;
        this.date = date;
        this.time = time;
        this.numOfProducts = numOfProducts;
        this.payer = payer;
        this.payment = payment;
        this.loadCode = loadCode;
        this.payerId = payerId;
        this.invoiceCode = invoiceCode;
    }
    public String getLoadCode() { return loadCode; }
    public String getCode() { return code; }
    public String getBenefactor() { return benefactor; }
    public String getPayer() { return payer; }
    public Date getDate(){ return date; }
    public Time getTime(){ return time; }
    public Integer getPayment(){ return payment; }
    public int getNumOfProducts(){ return  numOfProducts; }

    public boolean addTransaction()
    {
        return DataBase.insert("insert into transaction (code,loadCode,invoiceCode,date,time,payerId,payment,numberOfProducts) values ("+Integer.parseInt(code)+" , "+Integer.parseInt(loadCode)+" , "+Integer.parseInt(invoiceCode)+" , '"+date.toString()+"' , '"+time.toString()+"' , "+Integer.parseInt(payerId)+" , "+payment+" , "+numOfProducts+" );");
    }
    public boolean editTransaction()
    {
        return DataBase.edit("delete from transaction where code = "+code+" ;" , "insert into transaction (code,loadCode,invoiceCode,date,time,payerId,payment,numberOfProducts) values ("+Integer.parseInt(code)+" , "+Integer.parseInt(loadCode)+" , "+Integer.parseInt(invoiceCode)+" , '"+date.toString()+"' , '"+time.toString()+"' , "+Integer.parseInt(payerId)+" , "+payment+" , "+numOfProducts+" );" );
    }

}
