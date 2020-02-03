package service;

import java.util.List;

import entity.People;

public interface MatchService {

	List<People> match(String name);
}
