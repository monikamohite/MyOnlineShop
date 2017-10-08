package ril.com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ril.com.onlineshoppingbackend.dao.CategoryDAO;

@Controller
public class MyController {
	@Autowired
	CategoryDAO categoryDAO;
@RequestMapping(value={"/","/onlineshopping/","/onlineshopping"})
public ModelAndView index()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Home");
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
}
