/*
 * Use of package for better organizing source files
 */
package java.basics;

import java.util.Scanner;

/*
 * A class can contain data members, constructors and methods
 */
public class ClassSample {
	private int rollNumeber;
	private String name;
	private double percentile;
	private boolean isFullTimeStudent;

	public ClassSample() {
		System.out.println("Please add information using Setter methods");
	}

	public ClassSample(int rollNumeber, String name, double percentile, boolean isFullTimeStudent) {
		this.rollNumeber = rollNumeber;
		this.name = name;
		this.percentile = percentile;
		this.isFullTimeStudent = isFullTimeStudent;
	}

	public int getRollNumeber() {
		return rollNumeber;
	}

	public void setRollNumeber(int rollNumeber) {
		this.rollNumeber = rollNumeber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentile() {
		return percentile;
	}

	public void setPercentile(double percentile) {
		this.percentile = percentile;
	}

	public boolean isFullTimeStudent() {
		return isFullTimeStudent;
	}

	public void setFullTimeStudent(boolean isFullTimeStudent) {
		this.isFullTimeStudent = isFullTimeStudent;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ClassSample cs1 = new ClassSample();

		int rollNumeber = in.nextInt();
		String name = in.nextLine();
		double percentile = in.nextDouble();
		boolean isFullTimeStudent = in.nextBoolean();

		cs1.setRollNumeber(rollNumeber);
		cs1.setName(name);
		cs1.setPercentile(percentile);
		cs1.setFullTimeStudent(isFullTimeStudent);

		System.out.println("ClassSample [rollNumeber=" + cs1.getRollNumeber() + ", name=" + cs1.getName()
				+ ", percentile=" + cs1.getPercentile() + ", isFullTimeStudent=" + cs1.isFullTimeStudent + "]");

		rollNumeber = in.nextInt();
		name = in.nextLine();
		percentile = in.nextDouble();
		isFullTimeStudent = in.nextBoolean();

		ClassSample cs2 = new ClassSample(rollNumeber, name, percentile, isFullTimeStudent);
		System.out.println("ClassSample [rollNumeber=" + cs2.getRollNumeber() + ", name=" + cs2.getName()
				+ ", percentile=" + cs2.getPercentile() + ", isFullTimeStudent=" + cs2.isFullTimeStudent + "]");

		in.close();
	}

}
