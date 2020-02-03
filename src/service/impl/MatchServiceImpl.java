package service.impl;

import java.util.List;

import dao.PeopleDao;
import dao.impl.PeopleDaoImpl;
import entity.People;
import service.MatchService;


public class MatchServiceImpl implements MatchService {

	private PeopleDao peopleDao = new PeopleDaoImpl();
	public PeopleDao getPeopleDao() {
		return peopleDao;
	}
	public void setPeopleDao(PeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}
	@Override
	public List<People> match(String name) {
		// TODO Auto-generated method stub
		return peopleDao.findBest(name);
	}

}
