package com.example.restcontroller;

import java.math.BigDecimal;
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

import com.example.entity.Sale;
import com.example.service.SaleService;


@RestController
@RequestMapping("/api/sales")
public class SaleRestController {
	
	
	@Autowired
	private SaleService service;
	
	// Save a single entity
	@PostMapping(value="/sale",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Sale> createSale(@RequestBody Sale sale)
	{
		Sale sale2 = service.createSale(sale);
		return new ResponseEntity<>(sale2, HttpStatus.CREATED);
	}
	
	
	 // Save multiple entities
	@PostMapping(value="/batch",produces = "application/json",consumes = "application/json")
	public ResponseEntity<List<Sale>> createSales(@RequestBody List<Sale> sale)
	{
		List<Sale> sales = service.createSales(sale);
		return new ResponseEntity<>(sales, HttpStatus.CREATED);
	}
	
	
	 // Get an entity by ID
	@GetMapping(value="/sale/{id}",produces = "application/json")
	public ResponseEntity<Sale> getSaleById(@PathVariable("id") Integer id)
	{
		Sale saleById = service.getSaleById(id);
		return new ResponseEntity<>(saleById, HttpStatus.OK);
	}
	
	// Get all entities
	@GetMapping(value="/sales",produces = "application/json")
	public ResponseEntity<List<Sale>> getAllSales()
	{
		List<Sale> allSales = service.getAllSales();
		return new ResponseEntity<>(allSales, HttpStatus.OK);
	}
	
	@GetMapping("/total-potential-revenue")
    public ResponseEntity<BigDecimal> getTotalPotentialRevenue() {
        BigDecimal totalPotentialRevenue = service.getTotalPotentialRevenue();
        return new ResponseEntity<>(totalPotentialRevenue, HttpStatus.OK);
    }

}
