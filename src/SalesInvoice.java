import java.sql.Time;
import java.util.Date;

public class SalesInvoice {
    private String code;
    private String buyerName;
    private int numOfProduct;
    private int totalPrice;
    private int pricePerProduct;
    private Date date;
    private Time time;

    public SalesInvoice(String code,String buyerName,int numOfProduct,int totalPrice,int pricePerProduct,Date date,Time time)
    {
        this.code = code;
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
}
