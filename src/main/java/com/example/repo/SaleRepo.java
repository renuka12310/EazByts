package com.example.repo;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Sale;


public interface SaleRepo extends JpaRepository<Sale, Integer>{

	
	// Query to calculate sum of all sales amounts
    @Query("SELECT COALESCE(SUM(s.potentialRevenue), 0) FROM Sale s")
   public BigDecimal findTotalPotentialRevenue();
	 
	  
	
}
