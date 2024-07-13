package com.example.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Sale;
import com.example.repo.SaleRepo;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepo repo;
	
	
	@Override
	public Sale createSale(Sale sale) {
		Sale save = repo.save(sale);
		return save;
	}
	
	@Override
	public List<Sale> createSales(List<Sale> sales) {
		return repo.saveAll(sales);
	}


	@Override
	public Sale getSaleById(Integer id) {
		Optional<Sale> byId = repo.findById(id);
		return byId.get();
	}

	@Override
	public List<Sale> getAllSales() {
		List<Sale> all = repo.findAll();
		return all;
	}

	
	@Override
	public BigDecimal getTotalPotentialRevenue() {
	    List<Sale> sales = repo.findAll();
	    BigDecimal totalRevenue = BigDecimal.ZERO;
	    for (Sale sale : sales) {
	        totalRevenue = totalRevenue.add(sale.getPotentialRevenue());
	    }
	    return totalRevenue;
	}

	
	
	@Override
	public Sale updateSale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale deleteSale() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
