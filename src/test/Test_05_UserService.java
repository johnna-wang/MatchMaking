package test;

import java.sql.Date;

import entity.People;
import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

public class Test_05_UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService userService = new UserServiceImpl();
	//	User user = userService.login("linmei@163.com", "123456");
		int age = 20191212-Integer.parseInt("1992-09-09");
		User user = new User("��","zhang@163.com","zhang");
		People people = new People("��",age, "��","������", 
				null, null,"����", null, null, "δ��", Date.valueOf("1992-10-09"));
		int n = userService.register(user, people);
		System.out.print(n);
	}

}
