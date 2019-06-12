import org.springframework.data.jpa.repository.JpaRepository;

import com.apirecipe.APIRecipe.entity.Recipes;

public interface RecipesRepository extends JpaRepository <Recipes, Integer>{
	Recipes findByTitle(String title);

}
