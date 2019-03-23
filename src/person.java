import javax.swing.JOptionPane;

public class person {
 private static String name;
 private static String superpower;
 

	public person(String string, String string2) {
	// TODO Auto-generated constructor stub
		 name = string;
		superpower = string2;
		
		display(name, superpower);
}


	
	public static void display(String name, String superpower)
	{
		System.out.println(name + " has mad " + superpower + " skills");
	}

	
}
