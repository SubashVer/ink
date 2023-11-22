package com.example.ink;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ink {
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private Integer inkId;
    public Integer getInkId() {
		return inkId;
	}
    
	public void setInkId(Integer inkId) {
		this.inkId = inkId;
	}
	
	public String getInkname() {
		return inkname;
	}
	
	public void setInkname(String inkname) {
		this.inkname = inkname;
	}
	
	private String inkname;
}
