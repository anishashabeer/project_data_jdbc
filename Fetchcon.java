import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fetchcon {
    public static void main(String[] args) {
        

        try {
            String url = "jdbc:mysql://localhost:3306/hotel";
            String user = "root";
            String pass = "root";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");

            String query = "SELECT * FROM fooddetails";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.println("Current data:");
                
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Food Name: " + rs.getString("foodname"));
                System.out.println("Food Variety: " + rs.getString("foodvariety"));
                System.out.println("Food Price: " + rs.getInt("price"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
    

