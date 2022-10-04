package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.LogManager;

public class CategoryTest extends TestCase {

    Category category;
    @Before
    public  void setUp(){
        category=new Category();
    }
    @Test
    public void testGetId() throws Exception{
        Long idvalue=4L;
        category.setId(idvalue);
        assertEquals(idvalue,category.getId());
    }
    @Test
    public void testGetDescription() throws Exception {
    }
    @Test
    public void testGetRecipes() throws Exception {
    }
}