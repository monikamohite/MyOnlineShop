package ril.com.onlineshoppingbackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ril.com.onlineshoppingbackend.dao.CategoryDAO;
import ril.com.onlineshoppingbackend.dto.Category;

public class CategoryTest {
private static AnnotationConfigApplicationContext context;
private static CategoryDAO categoryDAO;
private static Category category;
@BeforeClass
public static void init()
{
	context=new AnnotationConfigApplicationContext();
	context.scan("ril.com.onlineshoppingbackend");
	context.refresh();
	categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
}

/*@Test
public void testGetCategory()
{
	category=categoryDAO.get(2);
	assertEquals("Successfully fetched sinngle category","Television",category.getName());
}*/

/*@Test
public void testUpdateCategory()
{
	category=categoryDAO.get(2);
	category.setName("TV");
	assertEquals("Successfuly updated", true,categoryDAO.update(category));
}*/

@Test
public void testDeleteCategory()
{
	 category=categoryDAO.get(4);
	 assertEquals("Successfully deleted a single category ", true,categoryDAO.delete(category));
}


/*@Test
public void  ListCategory()
{
	assertEquals("Successfully fetched query ",2, categoryDAO.list().size());
}
*/
/*@Test
public void AddCategory()
{
	category=new Category();
	category.setName("Radio");
	category.setDescription("Radio is added");
	category.setImageURL("CAT_1.png");
	assertEquals("Successfully added",true,categoryDAO.add(category));
}*/
}
