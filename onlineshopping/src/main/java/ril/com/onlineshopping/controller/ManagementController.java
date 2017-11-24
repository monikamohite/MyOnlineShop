package ril.com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manage")
public class ManagementController {
@RequestMapping(value="/products")
public ModelAndView showManageProducts()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("userClickMangerProducts",true);
	mv.addObject("title","ManageProducts");
	return mv;
}
}
