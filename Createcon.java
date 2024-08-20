import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class Createcon {
    public static void main(String[] args){
       
            try{
              String url = "jdbc:mysql://localhost:3306/hotel";
              String user = "root";
              String psswd = "root";
              Connection con = DriverManager.getConnection(url,user,psswd);
              String c_table = "create table fooddetails(id int primary key,foodname varchar(20),foodvariety varchar(20),price int not null)";
              Statement a = con.createStatement();
              a.executeUpdate(c_table);
              System.out.println("table created successfully");
              System.out.println("Connected");
    
            }
            catch(SQLException a){
                System.out.println(a);
            }
        }
    }
