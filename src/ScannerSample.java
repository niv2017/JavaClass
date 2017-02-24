import java.util.Scanner;

/*
 * This programs demonstrates use of Scanner class
 */
public class ScannerSample {
	private int age;
	private String name;
	private double salary;
	
	public ScannerSample(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Person [age=" + age + ", name=" + name + ", salary=" + salary + "]");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		String name = in.next();
		double salary = in.nextDouble();
		
		ScannerSample ss = new ScannerSample(age, name, salary);
		ss.display();
		
		in.close();
	}
	
}
