package com.vm.training.java.newFeatures;

public class Product {
private int productid;
private String productName;
private String productCategory;
private double price;
private double quantity;
public Product(int productid, String productName, String productCategory, double price, double quantity) {
	super();
	this.productid = productid;
	this.productName = productName;
	this.productCategory = productCategory;
	this.price = price;
	this.quantity = quantity;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productName=" + productName + ", productCategory=" + productCategory
			+ ", price=" + price + ", quantity=" + quantity + "]";
}




}
