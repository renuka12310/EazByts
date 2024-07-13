package com.example.restcontroller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.SaleService;


@Controller
public class DashboardController {

	@Autowired
	private SaleService sale;

	@GetMapping("/dashboard")
	public String showDashboard(Model model) {
		
		BigDecimal revenue = sale.getTotalPotentialRevenue();
		// Add attributes to the model 
		
		model.addAttribute("totalrevenu", revenue);
		return "dashboard"; // This should match the name of your template file (dashboard.html)
	}

}
