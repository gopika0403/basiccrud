package mainConnection;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.sql.*;
public class Properties {

		public void getcontectivity() throws SQLException{
				String url="jdbc:mysql://127.0.0.1:3306/details";
				String username="root";
				String password="1441";
				String Query="insert into student values(?,?)";
				
				
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement pst=con.prepareStatement(Query);
				pst.setInt(1,4);
				pst.setString(2, "gopika");
				
				pst.executeUpdate();
				
			}
			

		}


