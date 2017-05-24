
package com.chrishammer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appliances")
public class Appliance {

		@Id
		private long id;
		
		private String name;
		
		private float energyUsed;
		
		private String energyType;
		
		private String model;

		
		
		public float getEnergyUsed() {return energyUsed;}
		public long getId() {return id;}
		public String getName() {return name;}
		public String getEnergyType() {return energyType;}
		public String getModel() {return model;}
		
		public void setEnergyUsed(float energyUsed) {this.energyUsed = energyUsed;}
		public void setId(long id) {this.id = id;}
		public void setName(String name) {this.name = name;}
		public void setEnergyType(String energyType) {this.energyType = energyType;}
		public void setModel(String model) {this.model = model;}
		
}