package dao;

import java.util.List;

import entity.People;

public interface PeopleDao {

	List<People> findbysex_age(String sex,int age1,int age2,String religion);
	People findName(String name);
	List<People> findBest(String name);
}
