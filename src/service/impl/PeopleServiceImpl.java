package service.impl;

import java.util.List;

import dao.PeopleDao;
import dao.impl.PeopleDaoImpl;
import entity.People;
import service.PeopleService;

public class PeopleServiceImpl implements PeopleService {

	public PeopleDao getPeopleDao() {
		return peopleDao;
	}

	public void setPeopleDao(PeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}

	private PeopleDao peopleDao = new PeopleDaoImpl();
	public PeopleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<People> findbysex_age(String sex, int age1, int age2,String religion) {
		// TODO Auto-generated method stub
		return peopleDao.findbysex_age(sex, age1, age2,religion);
		
	}

	@Override
	public People findName(String name) {
		// TODO Auto-generated method stub
		return peopleDao.findName(name);
	}

}
