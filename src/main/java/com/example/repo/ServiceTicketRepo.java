package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Ticket;

public interface ServiceTicketRepo extends JpaRepository<Ticket, Integer> {

}
