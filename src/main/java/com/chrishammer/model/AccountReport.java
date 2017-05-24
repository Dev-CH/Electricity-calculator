
package com.chrishammer.model;

import java.math.BigDecimal;

public class AccountReport {
	
	private String productName;
	private int productOwned;
	private float productUsed;
	private long productId;
	private String productEnergyType;
	private float productTotalEnergy;
	private BigDecimal costBreakdown;
	private BigDecimal monthlyUseage;
	
	
	public AccountReport(String productName, int productOwned, float productUsed, long productId, float productTotalEnergy, String productEnergyType) {
		
		this.productName = productName;
		this.productOwned = productOwned;
		this.productUsed = productUsed;
		this.productId = productId;
		this.productTotalEnergy = productTotalEnergy;
		this.productEnergyType = productEnergyType;
	}
	
	
	public String getProductName() {return productName;}
	public int getProductOwned() {return productOwned;}
	public float getProductUsed() {return productUsed;}
	public long getProductId() {return productId;}
	public String getProductEnergyType() {return productEnergyType;}
	public float getProductTotalEnergy() {return productTotalEnergy;}
	public BigDecimal getCostBreakdown() {return costBreakdown;}
	public BigDecimal getMonthlyUseage() {return monthlyUseage;}
	
	public void setProductName(String productName) {this.productName = productName;}
	public void setProductOwned(int productOwned) {this.productOwned = productOwned;}
	public void setProductUsed(float productUsed) {this.productUsed = productUsed;}
	public void setProductId(int productId) {this.productId = productId;}
	public void setProductEnergyType(String productEnergyType) {this.productEnergyType = productEnergyType;}
	public void setProductTotalEnergy(float productTotalEnergy) {this.productTotalEnergy = productTotalEnergy;}
	public void setCostBreakdown(BigDecimal costBreakdown) {this.costBreakdown = costBreakdown;}
	public void setMonthlyUseage(BigDecimal monthlyUseage) {this.monthlyUseage = monthlyUseage;}
	


}