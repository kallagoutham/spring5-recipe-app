package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.Serializable;
import java.util.Set;

public class RecipeServiceImplTest extends TestCase {
    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepository recipeRepository;
    @Before
    public void setUp() throws  Exception{
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }
    @Test
    public void testGetRecipes() throws Exception{
        Set<Recipe> recipes= recipeService.getRecipes();
        assertEquals(recipes.size(),0);
    }
}