package com.example.demo.service;

import com.example.demo.enity.Product;

public interface ProductService {
	public void addNewProduct(Product p);
	public void changeProduct(Product p);
	public void removeProduct(Product p);
	public void getListProduct(Product p);
	public void getProductById(String id);
}
