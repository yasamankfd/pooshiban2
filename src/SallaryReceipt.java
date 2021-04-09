import java.sql.Time;
import java.util.Date;

public class SallaryReceipt {
    private String employeeName;
    private String employeeNid;
    private String code;
    private Date date;
    private Time time;
    private int amount;
    public SallaryReceipt(String employeeName,String code,Date date,Time time,int amount,String employeeNid)
    {
        this.employeeNid =employeeNid;
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
    public String getEmployeeNid() { return employeeNid; }

    public boolean addReceipt()
    {
        return DataBase.insert("insert into sallaryReceipt(employeeNid,code,date,time,amount) values ( "+employeeNid+" , "+code+" , '"+date.toString()+"' , '"+time.toString()+" , "+ amount+ " );");
    }
    public boolean editReceipt()
    {
        return DataBase.edit("delete from sallaryReceipt where code = "+ code + " ;","insert into sallaryReceipt(employeeNid,code,date,time,amount) values ( "+employeeNid+" , "+code+" , '"+date.toString()+"' , '"+time.toString()+" , "+ amount+ " );");
    }
    public boolean delete()
    {
        return DataBase.deleting("delete from sallaryReceipt where code = "+ code + " ;");
    }
}
