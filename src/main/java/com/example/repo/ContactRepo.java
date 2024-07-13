package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
