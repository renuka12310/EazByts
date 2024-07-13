package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Contact;
import com.example.repo.ContactRepo;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo repo;
	
	
	@Override
	public Contact addContact(Contact contact) {
		Contact save = repo.save(contact);
		return save;
	}
	
	@Override
	public List<Contact> addContacts(List<Contact> contacts) {
		return repo.saveAll(contacts);
	}


	
	@Override
	public Contact getContact(Integer id) {
	    Optional<Contact> getId = repo.findById(id);
	        return getId.get();
	}


	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}
	
	@Override
	public Contact UpdateContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact deleteContacts(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
