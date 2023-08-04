package webselenium;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

	public int insert(User user) throws ClassNotFoundException, SQLException {
		Connection con=dBUtil.dbConn();
		String sql="insert into userdetail values(?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,user.getUsername());
		return ps.executeUpdate();
		}
	
}


