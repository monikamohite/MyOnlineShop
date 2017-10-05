package ril.com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
@RequestMapping(value={"/","/onlineshopping/","/onlineshopping"})
public ModelAndView index()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Home");
    return mv;
}
}
