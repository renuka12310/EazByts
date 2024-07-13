package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Contact;
import com.example.service.ContactService;

@CrossOrigin(origins = "http://localhost:9091")
@RestController
@RequestMapping("/api/contacts") // Common prefix for all endpoints in this controller
public class ContactRestController {

    @Autowired
    private ContactService service;

    // Save a single entity
    @PostMapping(value = "/contact", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        Contact createContact = service.addContact(contact);
        return new ResponseEntity<>(createContact, HttpStatus.CREATED);
    }

    // Save multiple entities
    @PostMapping(value = "/batch", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<Contact>> createContacts(@RequestBody List<Contact> contacts) {
        List<Contact> createdContacts = service.addContacts(contacts);
        return new ResponseEntity<>(createdContacts, HttpStatus.CREATED);
    }

    // Get an entity by ID
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Contact> getContactById(@PathVariable("id") Integer id) {
        Contact contactById = service.getContact(id);
        return new ResponseEntity<>(contactById, HttpStatus.OK);
    }

    // Get all entities
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> allContacts = service.getAllContacts();
        return new ResponseEntity<>(allContacts, HttpStatus.OK);
    }
}
