
public class RecipeTypeCommand implements Command{
   Recipe recipe;
   public RecipeTypeCommand(Recipe recipe)
   {
	   this.recipe = recipe;
   }
@Override
public void execute() {
	recipe.recipeTypes();
	
}
   
}
