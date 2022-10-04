package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class IndexControllerTest extends TestCase {
    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    IndexController indexController;
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController=new IndexController(recipeService);
    }
    public void testGetIndexPage(){
        String viewname=indexController.getIndexPage(model);
        assertEquals("index",viewname);
    }
}