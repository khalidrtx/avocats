package org.avocats.avocats.entities.avocats;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class TribunalMere {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String type;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
