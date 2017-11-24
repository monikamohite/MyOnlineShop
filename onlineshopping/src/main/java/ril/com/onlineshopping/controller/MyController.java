package ril.com.onlineshopping.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import ril.com.onlineshopping.exception.ProductNotFoundException;
import ril.com.onlineshoppingbackend.dao.CategoryDAO;
import ril.com.onlineshoppingbackend.dao.ProductDAO;
import ril.com.onlineshoppingbackend.dto.Category;
import ril.com.onlineshoppingbackend.dto.Product;

@Controller
public class MyController {
	@Autowired
	ProductDAO productDAO;
	
	
	@Autowired
	CategoryDAO categoryDAO;
@RequestMapping(value={"/","/onlineshopping/","/onlineshopping"})
public ModelAndView index()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Home");
	/*logger.info("Inside page controller index method this is for Info");
	logger.debug("Inside page controller index method this is for debug");*/

	mv.addObject("userClickHome",true);
	mv.addObject("categories",categoryDAO.list());
    return mv;
}

@RequestMapping(value="/about")
public ModelAndView about()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","about");
	mv.addObject("userClickAbout",true);
	return mv;
}

@RequestMapping(value="contact")
public ModelAndView contact()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","contact");
	mv.addObject("userClickcontact",true);
	return mv;
}

@RequestMapping(value="services")
public ModelAndView services()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","services");
	mv.addObject("userClickservices",true);
	return mv;
}

/*Show all products*/

@RequestMapping(value="/show/all/products")
public ModelAndView showAllProducts()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","AllProducts");
	mv.addObject("categories",categoryDAO.list());
	mv.addObject("userClickAllProduct",true);
	return mv;
}

/* showing single product*/

@RequestMapping(value="show/{id}/product")
public ModelAndView showSingleProject(@PathVariable("id") int id)throws ProductNotFoundException 
{
	ModelAndView mv=new ModelAndView("page");
		Product product=productDAO.get(id);
		mv.addObject(product);
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("userClickShowProduct",true);
		return mv;
}

@RequestMapping(value="/show/category/{id}/products")
public ModelAndView showCategoryProducts(@PathVariable("id")int id)
{
//CategoryDAO to fetch single category
Category category=null;
category=categoryDAO.get(id);
ModelAndView mv=new ModelAndView("page");
mv.addObject("title",category.getName());
//passing the all category
mv.addObject("categories", categoryDAO.list());
//passing the sigle category.
mv.addObject("category", category);
mv.addObject("userClickCategoryProducts",true);
return mv;
}


}
