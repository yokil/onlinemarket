package net.sombra.form;
 
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "USERS")
public class User {
	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="nickame")
    private String  nickame;//err
    
    @Column(name="firstname")
    private String  firstname;
    
    @Column(name="lastname")
    private String  lastname;
    
    @Column(name="telephone")
    private String  telephone;
    
    @Column(name="email")
    private String  email;
    
    @Column(name="adress")
    private String  adress;
    
    @Column(name="created")
    private String  created;
    
    @OneToOne
    @JoinColumn(name="permission")
    private Permission permission;
    
   
    @OneToMany(mappedBy="user")
    private Set<Order> orders;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickame() {
		return nickame;
	}

	public void setNickame(String nickame) {
		this.nickame = nickame;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Set<Order> getOrders() {
		return  orders;
	}

	public void setOrders(Order orders) {
		this.orders.add(orders);
	}
}
