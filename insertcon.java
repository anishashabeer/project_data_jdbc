import java.sql.DriverManager;
import java.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class insertcon {
    public static void main(String[] args) {
        try {
           String url ="jdbc:mysql://localhost:3306/hotel";
           String user = "root";
           String psswd = "root";
           Connection con = DriverManager.getConnection(url, user, psswd);
           String insert = "insert into fooddetails() values(?,?,?,?)";
           PreparedStatement pre = con.prepareStatement(insert);
           pre.setInt(1,20);
           pre.setString(2,"Coffee");
           pre.setString(3,"Drinks");
           pre.setInt(4, 150);
           pre.executeUpdate();
           System.out.println("inserted success"); 
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

