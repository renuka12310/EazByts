package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Sale;
import com.example.entity.Task;
import com.example.entity.Ticket;
import com.example.service.SaleService;
import com.example.service.TaskService;
import com.example.service.TicketService;

@RestController
	public class ApiController {

	    @Autowired
	    private SaleService sales;

	    @Autowired
	    private TaskService task;

	    @Autowired
	    private TicketService supportTicket;

	    @GetMapping("/api/sales")
	    public List<Sale> getSalesRecords() {
	    	return sales.getAllSales();
	    }

	    @GetMapping("/api/tasks")
	    public List<Task> getTasks() {
	        return task.getAllTasks();
	    }

	    @GetMapping("/api/support")
	    public List<Ticket> getSupportTickets() {
	        return supportTicket.getAllTickets();
	    }
	}

