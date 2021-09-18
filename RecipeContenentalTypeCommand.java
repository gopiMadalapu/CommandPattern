
public class RecipeContenentalTypeCommand implements Command{
	   Recipe recipe;
	   public RecipeContenentalTypeCommand(Recipe recipe)
	   {
		   this.recipe = recipe;
	   }
	@Override
	public void execute() {
		recipe.continentalDishes();
		
	}
	   
	}