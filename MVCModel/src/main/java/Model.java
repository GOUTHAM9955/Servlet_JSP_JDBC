import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	private String uname;
	 private String email;
	 private String password;
	 private String ucity;
	 private Connection connect = null;
	 private PreparedStatement prestmt=null;
	 private int rowEffected;
	
	 public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	public int register() {
		try {
			connect = JdbcUtil.getConnection();
			String sql =  "INSERT INTO servletProject  ( name, email, password,city)" + "VALUES(?,?,?,?)";
			prestmt =  connect.prepareStatement(sql);
			prestmt.setString(1, uname);
			prestmt.setString(2, email);
			prestmt.setString(3, password);
			prestmt.setString(4, ucity);
			rowEffected = prestmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			
			try {
				JdbcUtil.closeResource(connect, prestmt);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowEffected;
	}


}
