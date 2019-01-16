package piyush.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import piyush.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
