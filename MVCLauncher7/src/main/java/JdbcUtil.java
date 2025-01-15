
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	
	static {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver got registered successfully");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	public static Connection getConnection() throws SQLException{
		
		String url=  "jdbc:mysql://localhost:3306/jdbclearning";
		String user = "root";
		String passcode = "gkakani1";
		return DriverManager.getConnection(url,user,passcode);
	}
	
	public static void closeResource(Connection connect, Statement stmt) throws SQLException{
		if(connect!=null)
			connect.close();
		
		if (stmt!=null)
			stmt.close();
	}
}
