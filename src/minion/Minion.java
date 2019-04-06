package minion;

public class Minion {
	private static String name; 
	private static int eyes; 
	private static String color; 
	private static String master;
	
	
		public Minion(String a, int b, String c, String d)
		{
			name = a;
			eyes = b;
			color = c;
			master = d;
		
		}
		
		public void setName(String a)
		{
			name = a;
		}
	
	public String getName() {
	
		return(name);
	}

	public void setEyes(int b)
	{
		eyes = b;
	}
	
	public int getEyes() {
	
		return(eyes);
	}

	
	public void setColor(String c)
	{
		color = c;
	}
	
	
	public String getColor() {
		
		return(color);
	}

	
	public void setMaster(String d)
	{
		master = d;
	}
	
	
	public String getMaster() {

		return(master);
	}
	
	public static void display(String name, String color, String master, int eyes)
	{
		System.out.println("The minion's name is " + name + ".");
		System.out.println("His favorite color is "+ color);
		System.out.println("He has " + eyes + " eyes.");
		System.out.println("His master is " + master + ".");
	}
}













