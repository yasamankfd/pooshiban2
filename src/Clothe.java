public class Clothe {
    private int id;
    private String fabricType;
    private String model;
    private int price;
    private String size;

    public  Clothe(int id,String fabricType,int price,String size,String model)
    {
        this.model = model;
        this.id = id;
        this.fabricType = fabricType;
        this.price = price;
        this.size = size;
    }
    public int getId(){ return id; }
    public String getFabricType() { return  fabricType; }
    public String getSize() { return size; }
    public int getPrice(){ return price; }
    public String getModel(){ return model; }

    public boolean addClothe()
    {
        return DataBase.insert("insert into clothe (clotheId,fabricType,model,price,size)values ( "+id+" , '"+fabricType+"' , '"+model+"' ,"+price+" , '"+size+" );");
    }
    public boolean editClothe()
    {
        return DataBase.edit("delete from clothe where clotheId = "+id+" ; ","insert into clothe (clotheId,fabricType,model,price,size)values ( "+id+" , '"+fabricType+"' , '"+model+"' ,"+price+" , '"+size+" );");
    }
    public boolean delete()
    {
        return DataBase.deleting("delete from clothe where clotheId = "+id+" ; ");
    }
}
