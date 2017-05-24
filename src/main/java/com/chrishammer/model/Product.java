
package com.chrishammer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="Products")
public class Product {

	@GeneratedValue
	@Id
	private long id;
	@NotEmpty
	private String name;
	private float energyUsed;					//per hour, in kWh
	@Range(min=1, max=40)	
	private int amountOwned;
	@Range(min=(long) 0.1, max=24)
	private float hoursUsed;
	private String energyType;
	private float totalEnergyUsed;				//monthly energy in kWh
	
	@ManyToOne
	private Account account; 
	
	public int getAmountOwned() {return amountOwned;}
	public float getEnergyUsed() {return energyUsed;}
	public Account getAccount() {return account;}
	public long getId() {return id;}
	public float getHoursUsed() {return hoursUsed;}
	public String getName() {return name;}
	public String getEnergyType() {return energyType;}
	public float getTotalEnergyUsed() {return totalEnergyUsed;}
	
	
	public void setAmountOwned(int amountOwned) {this.amountOwned = amountOwned;}
	public void setEnergyUsed(float energyUsed) {this.energyUsed = energyUsed;}
	public void setAccount(Account account) {this.account = account;}
	public void setId(long id) {this.id = id;}
	public void setHoursUsed(float hoursUsed) {this.hoursUsed = hoursUsed;}
	public void setName(String name) {this.name = name;}
	public void setEnergyType(String energyType) {this.energyType = energyType;}
	public void setTotalEnergyUsed(float totalEnergyUsed){this.totalEnergyUsed = totalEnergyUsed;}
	
}