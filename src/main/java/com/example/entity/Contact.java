package com.example.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Integer id;

    private String name;
    private String email;
    private String gender;
    private Long phone;
    private String address;
    private String company;

    // One-to-many relationships
    @OneToMany(mappedBy = "contact")
    private List<Sale> sales;

    @OneToMany(mappedBy = "contact")
    private List<Task> tasks;

    @OneToMany(mappedBy = "contact")
    private List<Ticket> supportTickets;
	

   
	  
}
