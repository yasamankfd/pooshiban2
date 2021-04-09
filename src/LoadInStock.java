import java.sql.Time;
import java.util.Date;

public class LoadInStock {
    private String code;
    private Date entryDate;
    private Time entryTime;
    private String content;
    private int weight;
    private int value;

    public LoadInStock(String code,Date entryDate,Time entryTime,String content,int weight,int value)
    {
        this.code = code;
        this.entryDate = entryDate;
        this.entryTime = entryTime;
        this.content = content;
        this.weight = weight;
        this.value = value;
    }
    public String getCode(){ return code; }
    public String getContent(){ return content; }
    public Date getEntryDate(){ return entryDate; }
    public Time getEntryTime(){ return entryTime; }
    public int getWeight(){ return weight; }
    public int getValue(){ return value; }

    public boolean addLoad()
    {
        return DataBase.insert("insert into loadInStock (code,DATE,TIME,content,weight,value) values ( "+code+" , '"+entryDate.toString()+"' , '"+entryTime.toString()+"' , '"+content+"' , "+weight+" , "+value+" );");
    }
    public boolean editLoad()
    {
        return DataBase.edit("delete from loadInStock where code = "+code+" ;","insert into loadInStock (code,DATE,TIME,content,weight,value) values ( "+code+" , '"+entryDate.toString()+"' , '"+entryTime.toString()+"' , '"+content+"' , "+weight+" , "+value+" );");
    }
    public boolean delete()
    {
        return DataBase.deleting("delete from loadInStock where code = "+code+" ;");
    }
}

