/*
 * This program is a sample for different constructors
 */
public class ConstructorSample {
	private int i;
	private String s;

	/*
	 * This is a empty constructor
	 */
	public ConstructorSample() {
		i = 1;
		s = "Hello";
	}
	
	/*
	 * This is a parameterized constructor
	 */
	public ConstructorSample(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	public void display() {
		System.out.println("ConstructorSample [i=" + i + ", s=" + s + "]");
	}

	public static void main(String[] args) {
		ConstructorSample cs1 = new ConstructorSample();
		ConstructorSample cs2 = new ConstructorSample(2, "Bye");
		
		cs1.display();
		cs2.display();
		
	}
}
