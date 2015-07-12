package net.sombra.form;
 
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIES")
public class Category {
	 	@Id
	    @Column(name="ID")
	    @GeneratedValue
	    private Integer id;
	     
	    @Column(name="name")
	    private String name;
	 
	    @OneToMany(mappedBy = "category")
	    private Product product;
	   
	    @ManyToOne(optional = true)
	    @JoinColumn(name="PARENT_ID")
	    private Category parentCategory;
	    
	    public Category getCategory() {
	        return parentCategory;
	    }

	    @OneToMany(mappedBy = "parentCategory")
	    private Set<Category> childCategory = new HashSet<Category>();
	    
	    public Set<Category> getCategories() {
	        return childCategory;
	    }
	    
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
	
	}