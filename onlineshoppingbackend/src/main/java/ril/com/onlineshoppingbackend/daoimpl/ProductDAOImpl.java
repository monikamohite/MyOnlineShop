package ril.com.onlineshoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ril.com.onlineshoppingbackend.dao.ProductDAO;
import ril.com.onlineshoppingbackend.dto.Product;

@Transactional
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Product get(int productId) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
		} 
		catch(Exception e)
		{
		return null;	
		}
		
		}

	@Override
	public List<Product> list() {
		try {
			return sessionFactory.getCurrentSession().createQuery("from Product",Product.class).getResultList();
		} catch (Exception e) {
			return null;
		}
	
		
	}

	@Override
	public boolean add(Product product) {
try {
	sessionFactory.getCurrentSession().persist(product);
	return true;
} catch (Exception e) {
	// TODO: handle exception
	return false;
}
		
	}

	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			sessionFactory.getCurrentSession().update(product);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return false;
	}

	@Override
	public List<Product> listActiveProducts() {
		String selectActiveProduct="FROM Product WHERE active= :active";
		
		return sessionFactory.getCurrentSession().createQuery(selectActiveProduct,Product.class).setParameter("active",true).getResultList();
	}

	@Override
	public List<Product> listActiveProductByCategory(int categoryId) {
		String selectActiveProductByCategory="FROM Product WHERE active=:active AND categoryId= :categoryID";
         return sessionFactory.getCurrentSession().createQuery(selectActiveProductByCategory,Product.class).setParameter("active", true).setParameter("categoryID", categoryId).getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		return sessionFactory.getCurrentSession().createQuery("FROM Product WHERE active=:active ORDER BY id",Product.class).setParameter("active", true).setFirstResult(0).setMaxResults(count).getResultList();
	}

}