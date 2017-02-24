/*
 * To run this program, open command prompt
 * Go to Location where this file is saved.
 * 
 * To compile run following command:
 * javac HelloName.java
 * 
 * To execute run following command:
 * java HelloName <Your_name>
 * e.g java HelloName Anil
 * 
 * Output on command prompt should be following:
 * Hello Anil!
 */
public class HelloName {
	public static void main(String[] args) {
		String name = args[0];
		System.out.println("Hello "+ name +"!");
	}
}
