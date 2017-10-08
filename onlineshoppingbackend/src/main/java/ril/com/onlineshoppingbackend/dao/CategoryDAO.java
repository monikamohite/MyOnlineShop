package ril.com.onlineshoppingbackend.dao;

import java.util.List;

import ril.com.onlineshoppingbackend.dto.Category;

public interface CategoryDAO {
	public Category get(int id);
	public List<Category>list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);


}
