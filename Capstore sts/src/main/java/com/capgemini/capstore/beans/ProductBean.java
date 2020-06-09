package com.capgemini.capstore.beans;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductBean {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column
	private String productName;
	@Column
	private String productQuantity;
	@Column
	private String productCategory;
	@Column
	private String productImage;
	@Column
	private double productDiscount;
	@Column
	private double productPrice;
	@Column
	private LocalDate productDiscountExpiryDate;
	@Column
	private String brandName;
	@Column
	private String email;
	@Column
	private double productRating;

	public double getProductRating() {
		return productRating;
	}

	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}

	

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getProductDiscountExpiryDate() {
		return productDiscountExpiryDate;
	}

	public void setProductDiscountExpiryDate(LocalDate productDiscountExpiryDate) {
		this.productDiscountExpiryDate = productDiscountExpiryDate;
	}

}
