package com.example.service;

import java.util.List;

import com.example.entity.Contact;

public interface ContactService {

	// to add the contacts
	public Contact addContact(Contact contact);
	
	// Method to add multiple contacts
	 public List<Contact> addContacts(List<Contact> contacts);

	// getContacts based on id
	public Contact getContact(Integer id);

	// all conatcts
	public List<Contact> getAllContacts();

	// edit the contacts
	public Contact UpdateContacts();

	// delete
	public Contact deleteContacts(Integer id);

}
