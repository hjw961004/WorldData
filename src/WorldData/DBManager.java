package WorldData;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public Connection con;
	public static final String USERNAME = "root";
	public static final String PASSWORD = "pendolsa03";
<<<<<<< Updated upstream
=======

	//public static final String URL = "jdbc:mysql://localhost:3305/국가 파일";
>>>>>>> Stashed changes
	public static final String URL = "jdbc:mysql://localhost:3305/contacts?characterEncoding=UTF-8&serverTimezone=UTC";
	
	public DBManager() {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
