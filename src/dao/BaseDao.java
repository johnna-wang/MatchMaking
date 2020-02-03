package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BaseDao {
	public	static	final	String	DRIVER;
	public	static	final	String	URL;
	public	static	final	String	USERNAME;
	public	static	final	String	PASSWORD;
	
	static {
		// 在加载本类时，读取连接信息
		Properties	props = new Properties();
		try {
			props.load(BaseDao.class.getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		DRIVER	= props.getProperty("driver");
		URL = props.getProperty("url");
		USERNAME = props.getProperty("username");
		PASSWORD = props.getProperty("password");		
	}
	
	public static	Connection	getConn(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static	void	closeAll(Connection conn, Statement stmt, ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// sql 参数为不定项参数，不定项参数的本质是数组(语法糖)
	public	static	int	executeUpdate(String sql, Object... params){
		Connection conn = getConn();
		PreparedStatement pstm = null;
		int r = 0;
		try {
			pstm = conn.prepareStatement(sql);
			if(params != null){
				for (int i = 0; i < params.length; i++) {
					pstm.setObject(i + 1, params[i]);
				}
			}
			r = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeAll(conn, pstm, null);
		}		
		return r;
	}
	
}









