
package com.chrishammer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Providers")
public class Provider {

	@Id
	private long id;
	
	private String name;
	private float electicUnit;
	private float waterUnit;
	private float standingChargePM;
	
	public String getName() {return name;}
	public float getStandingChargePM() {return standingChargePM;}
	public float getElecticUnit() {return electicUnit;}
	public float getWaterUnit() {return waterUnit;}

	
}