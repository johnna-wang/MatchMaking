package service;

import java.util.List;

import entity.People;

public interface PeopleService {

	List<People> findbysex_age(String sex,int age1,int age2,String religion);
	People findName(String name);
}
