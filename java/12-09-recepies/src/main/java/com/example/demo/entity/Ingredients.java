package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ingredients {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String amount;
	private String Description;
	
	@OneToOne
    private Receipes receipes;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Receipes getReceipes() {
		return receipes;
	}
	public void setReceipes(Receipes receipes) {
		this.receipes = receipes;
	}
	public Ingredients() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((receipes == null) ? 0 : receipes.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredients other = (Ingredients) obj;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (receipes == null) {
			if (other.receipes != null)
				return false;
		} else if (!receipes.equals(other.receipes))
			return false;
		return true;
	}
	public Ingredients(String amount, String description, Receipes receipes) {
		super();
		this.amount = amount;
		Description = description;
		this.receipes = receipes;
	}
	public Ingredients(Long id, String amount, String description) {
		super();
		this.id = id;
		this.amount = amount;
		Description = description;
	}
	public Ingredients(String amount, String description) {
		super();
		this.amount = amount;
		Description = description;
	}
	
	
}
