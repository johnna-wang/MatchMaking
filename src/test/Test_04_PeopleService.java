package test;

import java.util.List;

import entity.People;
import service.PeopleService;
import service.impl.PeopleServiceImpl;

public class Test_04_PeopleService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PeopleService peopleService = new PeopleServiceImpl();
		//String sex = "Ů";
		int a = Integer.parseInt("20");
		int b = Integer.parseInt("28");
		List<People>list = peopleService.findbysex_age("Ů", a, b, "������");
		for(People people : list){
		System.out.println(people);
		}
	}

}
