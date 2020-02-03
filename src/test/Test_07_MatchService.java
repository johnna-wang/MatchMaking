package test;

import java.util.Collections;
import java.util.List;

import entity.People;
import service.MatchService;
import service.impl.MatchServiceImpl;

public class Test_07_MatchService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatchService matchService = new MatchServiceImpl();
		List<People>list =  matchService.match("ÀîËÄ");
		Collections.sort(list);
		
		for(People people : list){
			System.out.println(people);
		}
	}

}
