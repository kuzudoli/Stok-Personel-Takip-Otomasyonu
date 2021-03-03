package ConnectionZ;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Naperva
 */ 
public class Connectionz {
    public static Connection con;
    public static String dbFile = "Personeller_DB.accdb"; //DOSYAYI TUTAN STRING DEGISKENI STATIK TANIMLANDI.
    
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://Personeller_DB.accdb");
        }
        catch(Exception ex){
            System.out.println(""+ex);
        }
        return con;
    }
}
