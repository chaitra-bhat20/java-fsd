
package webselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dBUtil {

	public static Connection dbConn() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		return con;
	}
	
}
