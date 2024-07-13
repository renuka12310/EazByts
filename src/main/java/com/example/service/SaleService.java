package com.example.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.entity.Sale;

public interface SaleService {

	// creaet sale
	public Sale createSale(Sale sale);

	// Method to add multiple sales
	public List<Sale> createSales(List<Sale> sales);

	// getsales by id
	public Sale getSaleById(Integer id);

	// get all sales
	public List<Sale> getAllSales();
	
	//to get all total sales
	public BigDecimal getTotalPotentialRevenue();

	// update sale
	public Sale updateSale();

	// delete sale
	public Sale deleteSale();


}
