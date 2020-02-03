package service;

import entity.People;
import entity.User;

public interface UserService {

	User login(String email,String pwd);
	int register(User user, People people);
}
