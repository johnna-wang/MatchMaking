package test;

import java.util.List;

import dao.PeopleDao;
import dao.impl.PeopleDaoImpl;
import entity.People;

public class Test_03_PeopleDao {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PeopleDao peopledao = new PeopleDaoImpl();
		List<People> list = peopledao.findbysex_age("��", 20, 28,"������");
		
		for(People people:list){
			System.out.println(people);
		}
		
	}

}
