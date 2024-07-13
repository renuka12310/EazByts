package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Ticket;
import com.example.repo.ServiceTicketRepo;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private ServiceTicketRepo repo;

	@Override
	public Ticket createTicket(Ticket ticket) {
		return repo.save(ticket);
	}

	@Override
	public List<Ticket> createTickets(List<Ticket> tickets) {
		return repo.saveAll(tickets);
	}

	@Override
	public Ticket getTicketkById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Ticket> getAllTickets() {
		return repo.findAll();
	}

	@Override
	public Ticket updateTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket deleteTicket() {
		// TODO Auto-generated method stub
		return null;
	}

}
