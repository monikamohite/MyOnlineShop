package ril.com.onlineshoppingbackend.dto;

import javax.mail.Multipart;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String code;
@NotBlank(message="Please Enter the product name ")
private String name;
@NotBlank(message="Please Enter the Brand name ")
private String brand;

@JsonIgnore
@NotBlank(message="Please Enter the Description")
private String description;

@Column(name="unit_price")
@Min(value=1,message="price value cannot be less than 1 !")
private double unitPrice;

private int quantity;

@Transient
private MultipartFile file;
@Column(name="is_active")
@JsonIgnore
private boolean active;

@Column(name="category_id")
@JsonIgnore
private int categoryId;
@Column(name="supplier_id")
@JsonIgnore
private int supplierId;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public int getPurchase() {
	return purchase;
}
public void setPurchase(int purchase) {
	this.purchase = purchase;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}
@Column(name="purchases")
private int purchase;
private int views;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int id, String code, String name, String brand, String description, double unitPrice, int quantity,
		MultipartFile file, boolean active, int categoryId, int supplierId, int purchase, int views) {
	super();
	this.id = id;
	this.code = code;
	this.name = name;
	this.brand = brand;
	this.description = description;
	this.unitPrice = unitPrice;
	this.quantity = quantity;
	this.file = file;
	this.active = active;
	this.categoryId = categoryId;
	this.supplierId = supplierId;
	this.purchase = purchase;
	this.views = views;
}

}
