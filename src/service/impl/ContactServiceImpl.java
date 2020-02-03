package service.impl;

import dao.ContactDao;
import dao.impl.ContactDaoImpl;
import entity.Contact;
import service.ContactService;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao = new ContactDaoImpl();
	
	public ContactDao getContactDao() {
		return contactDao;
	}
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@Override
	public int insertContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactDao.insertContact(contact);
	}

}
