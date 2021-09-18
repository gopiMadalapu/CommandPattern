
public class RecipeCostCommand implements Command{
	   Recipe recipe;
	   public RecipeCostCommand(Recipe recipe)
	   {
		   this.recipe = recipe;
	   }
	@Override
	public void execute() {
		recipe.cost();		
	}
	   
	}