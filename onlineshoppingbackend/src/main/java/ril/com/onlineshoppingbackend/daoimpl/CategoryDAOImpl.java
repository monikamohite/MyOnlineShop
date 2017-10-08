package ril.com.onlineshoppingbackend.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ril.com.onlineshoppingbackend.dao.CategoryDAO;
import ril.com.onlineshoppingbackend.dto.Category;
@Transactional
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	@Autowired
	SessionFactory sessionFactory;
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
		
	}

	public List<Category> list() {
		String selectHQL="from Category where active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectHQL);
		query.setParameter("active",true);
			
		return query.getResultList();
	}

	public boolean add(Category category) {
	try {
		sessionFactory.getCurrentSession().persist(category);
		return true;
	} catch (Exception e) {
		return false;
	}
		
	}

	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public boolean delete(Category category) {
category.setActive(false);
try {
	sessionFactory.getCurrentSession().update(category);
	return true;
	
} catch (Exception e) {
	return false;
}
		
	}

}
