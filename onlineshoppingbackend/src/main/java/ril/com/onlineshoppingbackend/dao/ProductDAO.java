package ril.com.onlineshoppingbackend.dao;

import java.util.List;

import ril.com.onlineshoppingbackend.dto.Product;

public interface ProductDAO {
	public Product get(int productId);
	public List<Product> list();
	public boolean add(Product product);
	public boolean update(Product product); 
	public boolean delete(Product product);
	public List<Product> listActiveProducts();
	public List<Product> listActiveProductByCategory(int cateoryId);
	public List<Product> getLatestActiveProducts(int count);
}
