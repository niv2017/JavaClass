package java.basics;

public class MethodOverloadingSample {
	public void disp(char c) {
		System.out.println("I will print the CHARACTER : " + c);
	}

	public void disp(int c) {
		System.out.println("I will print the INTEGER : " + c);
	}
	
	public void disp(char c, int num) {
		System.out.print("I will print the CHARACTER first and then the INTEGER : 	");
		System.out.println(c + " " + num);
	}

	public void disp(int num, char c) {
		System.out.print("I will print the INTEGER first and then the CHARACTER : 	");
		System.out.println(num + " " + c);
	}

	public static void main(String[] args) {
		MethodOverloadingSample methodOverloadingSample = new MethodOverloadingSample();
		methodOverloadingSample.disp('a');
		methodOverloadingSample.disp(5);
		methodOverloadingSample.disp('c', 10);
		methodOverloadingSample.disp(50, 'e');
	}
}
