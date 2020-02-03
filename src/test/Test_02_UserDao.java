package test;

import entity.People;
import entity.User;

import java.sql.Date;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class Test_02_UserDao {
	public static void main(String[] args) {
	
		// TODO Auto-generated constructor stub
		UserDao userDao = new UserDaoImpl();
		User user = userDao.findbyEmail("lily@163.com");
		System.out.println(user);

		User user1 = new User("w","q@qq.com","qiao");
		People people = new People("w",30, "women", "Hindu","Chinese","China", "henan","Bachelors","softerware engirneer", "Never Married", Date.valueOf("1989-12-12"));
		int n = userDao.insertUser(user1,people);
		System.out.print(n);
	
	}
}
