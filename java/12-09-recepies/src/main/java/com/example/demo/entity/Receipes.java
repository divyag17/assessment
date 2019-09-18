package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Receipes {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String name;
	private String cookingtime;
	private String difficulty;
	private String directions;
	private String source;
	
	@OneToOne
    private Notes notes;

	public Receipes(String name, String cookingtime, String difficulty, String directions, String source) {
		super();
		this.name = name;
		this.cookingtime = cookingtime;
		this.difficulty = difficulty;
		this.directions = directions;
		this.source = source;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	public Receipes(String name, String cookingtime, String difficulty, String directions, String source, Notes notes) {
		super();
		this.name = name;
		this.cookingtime = cookingtime;
		this.difficulty = difficulty;
		this.directions = directions;
		this.source = source;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCookingtime() {
		return cookingtime;
	}

	public void setCookingtime(String cookingtime) {
		this.cookingtime = cookingtime;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cookingtime == null) ? 0 : cookingtime.hashCode());
		result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
		result = prime * result + ((directions == null) ? 0 : directions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		Receipes other = (Receipes) obj;
		if (cookingtime == null) {
			if (other.cookingtime != null)
				return false;
		} else if (!cookingtime.equals(other.cookingtime))
			return false;
		if (difficulty == null) {
			if (other.difficulty != null)
				return false;
		} else if (!difficulty.equals(other.difficulty))
			return false;
		if (directions == null) {
			if (other.directions != null)
				return false;
		} else if (!directions.equals(other.directions))
			return false;
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
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}

	public Receipes(Long id, String cookingtime, String difficulty, String directions, String source, Notes notes) {
		super();
		this.id = id;
		this.cookingtime = cookingtime;
		this.difficulty = difficulty;
		this.directions = directions;
		this.source = source;
		this.notes = notes;
	}

	public Receipes() {
		super();
	}

	public Receipes(String cookingtime, String difficulty, String directions, String source, Notes notes) {
		super();
		this.cookingtime = cookingtime;
		this.difficulty = difficulty;
		this.directions = directions;
		this.source = source;
		this.notes = notes;
	}

	public Receipes(String cookingtime, String difficulty, String directions, String source) {
		super();
		this.cookingtime = cookingtime;
		this.difficulty = difficulty;
		this.directions = directions;
		this.source = source;
	}
	
	
	
}
