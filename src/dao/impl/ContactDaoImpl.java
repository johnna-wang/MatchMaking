package dao.impl;

import dao.BaseDao;
import dao.ContactDao;
import entity.Contact;

public class ContactDaoImpl implements ContactDao {

	@Override
	public int insertContact(Contact contact) {
		// TODO Auto-generated method stub
		
		return BaseDao.executeUpdate("INSERT INTO contact VALUES (?, ?, ?,?)", contact.getName(),
				contact.getEmail(),contact.getPhone(),contact.getMessage());
				
	}

}
