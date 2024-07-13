package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Ticket;
import com.example.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketRestController {

	@Autowired
	private TicketService service;

	@PostMapping(value = "/ticket", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
		Ticket ticket2 = service.createTicket(ticket);
		return new ResponseEntity<>(ticket2, HttpStatus.CREATED);
	}

	@PostMapping(value = "/batch", produces = "application/json", consumes = "application/json")
	public ResponseEntity<List<Ticket>> createTickets(@RequestBody List<Ticket> tickets) {
		List<Ticket> tickets1 = service.createTickets(tickets);
		return new ResponseEntity<>(tickets1, HttpStatus.CREATED);
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Ticket> getTicketById(@PathVariable("id") Integer id) {
		Ticket ticketkById = service.getTicketkById(id);
		return new ResponseEntity<>(ticketkById, HttpStatus.OK);
	}

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}

}
