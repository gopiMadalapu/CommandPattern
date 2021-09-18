
public class CurryRecipeFactoryDemo {

	public static void main(String[] args) {
		Recipe recipe = new Recipe();
		RecipeCommand command=new RecipeCommand();
		command.setCommand(new RecipeTypeCommand(recipe));
		command.execute();
		
		command.setCommand(new RecipeContenentalTypeCommand(recipe));
		command.execute();
		
		command.setCommand(new RecipeCostCommand(recipe));
		command.execute();
		
	}

}
