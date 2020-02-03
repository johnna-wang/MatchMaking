package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.People;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	private UserDao userDao = new UserDaoImpl();
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String email, String pwd) {
		// TODO Auto-generated method stub
		return userDao.findByEmailPwd(email,pwd);
	}

	@Override
	public int register(User user,People people) {
		// TODO Auto-generated method stub

		if(userDao.findbyEmail(user.getEmail()) != null){
			return -1; //表示用户已存在
		}
		
		return userDao.insertUser(user, people);
	}

}
