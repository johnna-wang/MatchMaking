package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.BaseDao;

import dao.UserDao;
import entity.People;
import entity.User;

public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User findbyEmail(String email) {
		// TODO Auto-generated method stub
		Connection conn = BaseDao.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		User user = null;
		try {
			pstm = conn.prepareStatement("select * from user where email=?");
			pstm.setString(1, email);
			rs = pstm.executeQuery();
			if (rs.next()){
				user = new User();
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, pstm, rs);
		}
		return user;
	}

	@Override
	public int insertUser(User user,People people) {
		// TODO Auto-generated method stub
		 int a = BaseDao.executeUpdate("INSERT INTO USER VALUES (?, ?, ?)", 
				user.getName(),	user.getEmail(), user.getPassword());
		 
		 int b = BaseDao.executeUpdate("INSERT INTO information VALUES (?, ?, ?,?,?,?,?,?,?,?,?)", 
					people.getName(),people.getSex(),people.getAge(),people.getReligion(),people.getMother_tongue(),people.getCountry(),people.getLocation(),people.getEducation(),people.getProfession(),people.getStatus(),people.getDate());
		 if((a+b)==2){
			 return 1;
		 }
		 return 0;
	}

	@Override
	public User findByEmailPwd(String email, String pwd) {
		// TODO Auto-generated method stub
		Connection conn = BaseDao.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		User user = null;
		try {
			pstm = conn.prepareStatement("select * from user "
					+ "where email=? and password=?");
			pstm.setString(1, email);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();
			if (rs.next()){
				user = new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, pstm, rs);
		}
		return user;	
	}

}
