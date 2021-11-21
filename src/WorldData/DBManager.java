package WorldData;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public Connection con;
	public static final String USERNAME = "root";
	public static final String PASSWORD = "wldnjs53";
	public static final String URL = "jdbc:mysql://localhost:3306/world_data";
	
	public DBManager() {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
