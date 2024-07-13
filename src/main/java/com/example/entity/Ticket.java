package com.example.entity;



import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "support_tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Integer id;

    private String customerName;
    private String issueDescription;
    private String status;
    private String agentAssigned;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;
}
