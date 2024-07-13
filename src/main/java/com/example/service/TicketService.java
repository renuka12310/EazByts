package com.example.service;

import java.util.List;

import com.example.entity.Ticket;



public interface TicketService {

	// creaet ServiceTicket
	public Ticket createTicket(Ticket ticket);
	
	// creaet multiple ServiceTicket
		public List<Ticket> createTickets(List<Ticket> tickets);

	// getServiceTicket by id
	public Ticket getTicketkById(Integer id);

	// get all ServiceTicket
	public List<Ticket> getAllTickets();

	// update sServiceTicket
	public Ticket updateTicket();

	// delete ServiceTicket
	public Ticket deleteTicket();

}
