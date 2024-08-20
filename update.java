import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update{
    public static void main(String[] args) {
         try {
            String url="jdbc:mysql://localhost:3306/hotel";
            String user="root";
            String pass="root";
            Connection con=DriverManager.getConnection(url, user, pass);
            String update="update fooddetails set id=? where foodname=?";
            PreparedStatement pre=con.prepareStatement(update);
            pre.setInt(1,12);
            pre.setString(2,"Coffee");
            pre.executeUpdate();
            System.out.println("Updated successfully");

            System.out.println("Connected");
            } 
            catch (SQLException e) {
            System.out.println(e);

        }
    }
}
