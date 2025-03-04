package com.poly.entity;

import javax.persistence.*;

@Entity
@Table(name = "Gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "thumbnail")
    private String thumbnail;
    // Constructors, getters, and setters

	public Gallery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gallery(int id, Product product, String thumbnail) {
		super();
		this.id = id;
		this.product = product;
		this.thumbnail = thumbnail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
    
    
}