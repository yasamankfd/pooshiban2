import java.sql.Time;
import java.util.Date;

public class SallaryReceipt {
    private String employeeName;
    private String code;
    private Date date;
    private Time time;
    private int amount;
    public SallaryReceipt(String employeeName,String code,Date date,Time time,int amount)
    {
      this.employeeName = employeeName;
      this.amount = amount;
      this.code = code;
      this.date = date;
      this.time = time;
    }
    public String getEmployeeName() { return employeeName; }
    public String getCode() { return code; }
    public int getAmount(){ return amount; }
    public Time getTime(){ return time; }
    public Date getDate(){ return date; }
}
