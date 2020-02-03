package test;

import entity.Contact;
import service.ContactService;
import service.impl.ContactServiceImpl;

public class Test_06_ContactService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContactService contactService = new ContactServiceImpl();
		Contact contact = new Contact("张三","zhangsan.com","1248837095","对你们非常满意");
		contactService.insertContact(contact);
		System.out.print(contact);
	}

}
