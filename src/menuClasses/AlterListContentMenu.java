package menuClasses;

import java.util.ArrayList;

public class AlterListContentMenu extends Menu {
	private static final AlterListContentMenu ALC = new AlterListContentMenu(); 
	AlterListContentMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alter list content"; 
		options.add(new Option("Add a New Value to a List", new AddToListAction()));
		options.add(new Option("Delete a Position from a List", new DeleteFromListAction())); 
		options.add(new Option(("Show Content of a list"), new ShowListAction()));
	
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 
	}
	
	public static AlterListContentMenu getAlterListContentMenu() { 
		return ALC; 
	}

	
}
