package com.poly.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Product_Item")
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "qty_in_stock")
    private int qtyInStock;

    @Column(name = "price")
    private double price;

    @Column(name = "original_price")
    private double originalPrice;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;
    // Constructors, getters, and setters

	public ProductItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductItem(int id, Product product, int qtyInStock, double price, double originalPrice,
			LocalDateTime createAt, LocalDateTime updateAt) {
		super();
		this.id = id;
		this.product = product;
		this.qtyInStock = qtyInStock;
		this.price = price;
		this.originalPrice = originalPrice;
		this.createAt = createAt;
		this.updateAt = updateAt;
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
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public LocalDateTime getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}
    
    
}