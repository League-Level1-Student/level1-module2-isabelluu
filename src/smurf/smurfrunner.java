package smurf;

public class smurfrunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	
	handy.eat();
	handy.getName();
	
	Smurf papa = new Smurf("Papa");
	papa.getHatColor();
	papa.getName();
	papa.isGirlOrBoy();
	
	Smurf smurfg = new Smurf("Smurfette");
	smurfg.getHatColor();
	smurfg.getName();
	smurfg.isGirlOrBoy();
}
}
