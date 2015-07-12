package net.sombra.form;
 

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
    @Column(name="PRODUCT_ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="COST")
    private Integer  cost;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name="CATEGORY")
    private Category category;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	private Set<Order> orders;
	
	public Set<Order> getStocks() {
		return this.orders;
	}
 
	public void setStocks(Set<Order> orders) {
		this.orders = orders;
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}