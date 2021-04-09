import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {

    private static final String url = "jdbc:mysql://51.89.107.182:3306/pooshiban?user=test3&password=1111&useUnicode=true&characterEncoding=UTF-8";
    private static final String class_for_name = "com.mysql.jdbc.Driver";

    public static boolean addUser(String statement)
    {

        boolean added = true;
        try{
            Class.forName(class_for_name).newInstance();
            Connection connection = DriverManager.getConnection(url);
            Statement statement1 = connection.createStatement();
            statement1.execute(statement);
            statement1.close();
            connection.close();
        }catch (Exception e)
        {
            added = false;
            e.printStackTrace();
        }

        return added;
    }
    public static boolean editUser(String pkeyToDelete,String table,String fieldname , String state)
    {
        boolean edited = true;
        try{
            Class.forName(class_for_name).newInstance();
            Connection connection = DriverManager.getConnection(url);
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            statement1.execute("delete from "+ table +" where " +fieldname+" = "+pkeyToDelete + " ;");
            statement1.close();
            statement2.execute(state);
            statement2.close();
            connection.close();
        }catch (Exception e)
        {
            edited = false;
            e.printStackTrace();
        }
        return edited;
    }
    public static boolean insert(String query)
    {
        boolean added = true;
        try{
            Class.forName(class_for_name).newInstance();
            Connection connection = DriverManager.getConnection(url);
            Statement statement1 = connection.createStatement();
            statement1.execute(query);
            statement1.close();
            connection.close();
        }catch (Exception e)
        {
            added = false;
            e.printStackTrace();
        }

        return added;
    }
    public static boolean edit(String deletingstatement  ,String query)
    {
        boolean edited = true;
        try{
            Class.forName(class_for_name).newInstance();
            Connection connection = DriverManager.getConnection(url);
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            statement1.execute(deletingstatement);
            statement1.close();
            statement2.execute(query);
            statement2.close();
            connection.close();
        }catch (Exception e)
        {
            edited = false;
            e.printStackTrace();
        }
        return edited;
    }
    public static boolean deleting(String query)
    {
        boolean deleted = true;
        try{
            Class.forName(class_for_name).newInstance();
            Connection connection = DriverManager.getConnection(url);
            Statement statement1 = connection.createStatement();
            statement1.execute(query);
            statement1.close();
            connection.close();
        }catch (Exception e)
        {
            deleted = false;
            e.printStackTrace();
        }

        return deleted;
    }
    }
