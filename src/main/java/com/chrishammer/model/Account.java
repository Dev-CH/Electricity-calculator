
package com.chrishammer.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.chrishammer.view.Password;
import com.chrishammer.view.UserName;
import com.chrishammer.view.ValidUser;

@Entity
@Table(name="Accounts")
public class Account {

	@GeneratedValue
	@Id
	private long id;
	@ValidUser
	@UserName
	private String userName;
	@Password
	private String password;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String surname;
	

	@OneToMany(mappedBy="account", cascade=CascadeType.ALL)
	private List<Product> accountProducts = new ArrayList<Product>();

	public List<Product> getAccountProducts() {return accountProducts;}
	public long getId() {return id;}
	public String getPassword() {return password;}
	public String getUserName() {return userName;}
	public String getFirstName() {return firstName;}
	public String getSurname() {return surname;}
	
	
	public void setAccountProducts(List<Product> accountProducts) {this.accountProducts = accountProducts;}
	public void setId(long id) {this.id = id;}
	public void setPassword(String password) {this.password = password;}
	public void setUserName(String userName) {this.userName = userName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public void setSurname(String sirName) {this.surname = sirName;}	
	
}