
/*
 * General rule: Make as much stuff private as you can and
 * provide a public API (application programming interface)
 * with some public methods to prevent tight coupling of classes
 * and to control how people interface with your class (so you
 * don't have to worry about someone messing up your shit)
 */

class Plant {
	//usually exposed instance variables are constants
	public static final int ID = 7;
	
	//usually hide the instance variables
	private String name;

	
	public String getData() {
		String data = "some stuff " + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 5;
	}
	
	//use getters and setters to access private/instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
	}

}
