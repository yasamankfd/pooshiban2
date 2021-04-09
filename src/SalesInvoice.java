import java.sql.Time;
import java.util.Date;

public class SalesInvoice {
    private String code;
    private String buyerName;
    private String customerId;
    private int numOfProduct;
    private int totalPrice;
    private int pricePerProduct;
    private Date date;
    private Time time;

    public SalesInvoice(String code,String buyerName,int numOfProduct,int totalPrice,int pricePerProduct,Date date,Time time,String customerId)
    {
        this.code = code;
        this.customerId = customerId;
        this.buyerName = buyerName;
        this.date = date;
        this.time = time;
        this.pricePerProduct = pricePerProduct;
        this.totalPrice = totalPrice;
        this.numOfProduct = numOfProduct;
    }
    public Time getTime(){ return time; }
    public Date getDate(){ return date; }
    public String getCode() { return code; }
    public int getNumOfProduct(){ return numOfProduct; }
    public int getTotalPrice(){ return totalPrice; }
    public  int getPricePerProduct(){ return pricePerProduct; }
    public String getBuyerName(){ return buyerName; }
    public String getCustomerId() { return customerId; }

    public boolean addIvoice()
    {
        return DataBase.insert("insert into salesInvoice(code,customerId,numberOfProducts,totalPrice,date,time) values ( "+code+" , "+customerId+" , "+numOfProduct+" , "+totalPrice+" , '"+date.toString()+"' , '"+time.toString()+"' );");
    }
    public boolean editInvoice()
    {
        return DataBase.edit("delete from salesInvoice where code = "+code+ " ;","insert into salesInvoice(code,customerId,numberOfProducts,totalPrice,date,time) values ( "+code+" , "+customerId+" , "+numOfProduct+" , "+totalPrice+" , '"+date.toString()+"' , '"+time.toString()+"' );");
    }
    public boolean delete()
    {
        return DataBase.deleting("delete from salesInvoice where code = "+code+ " ;");
    }
}
