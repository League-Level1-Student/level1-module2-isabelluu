package tea_maker;

import tea_maker.Kettle.Water;

public class tearunner {
public static void main(String[] args) {
	TeaBag tea = new TeaBag("Green");
	
	tea.getFlavor();
	
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	
	//Water water = new Water();
	//water.isHot();
	
	Cup cup = new Cup();
	cup.makeTea(tea, kettle);
	
}
}
