package net.sombra.form;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


public class Order {
	
	@Id
    @Column(name="ORDER_ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="cost")
    private Integer  cost;
	
	@ManyToOne
    @JoinColumn(name="USER")
    private User user;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "ORDER_PRODUCT", catalog = "sombrastore", joinColumns = { 
			@JoinColumn(name = "ORDER_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID", 
					nullable = false, updatable = false) })
	private Set<Product> products;
	public Set<Product> getCategories() {
		return this.products;
	}
 
	public void setCategories(Set<Product> products) {
		this.products = products;
	}

}
