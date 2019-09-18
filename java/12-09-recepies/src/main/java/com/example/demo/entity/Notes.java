package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Notes {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String notes;
	 
	@OneToOne
    private Receipes receipes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Receipes getReceipes() {
		return receipes;
	}

	public void setReceipes(Receipes receipes) {
		this.receipes = receipes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		Notes other = (Notes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (receipes == null) {
			if (other.receipes != null)
				return false;
		} else if (!receipes.equals(other.receipes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", notes=" + notes + ", receipes=" + receipes + "]";
	}

	public Notes(String notes, Receipes receipes) {
		super();
		this.notes = notes;
		this.receipes = receipes;
	}

	public Notes(String notes) {
		super();
		this.notes = notes;
	}

	public Notes() {
		super();
	}
	

}
