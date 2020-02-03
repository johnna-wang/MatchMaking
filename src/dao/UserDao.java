package dao;

import entity.People;
import entity.User;

public interface UserDao {

	User findbyEmail(String email);
	User findByEmailPwd(String email, String pwd);
	int insertUser(User user,People people);
}
