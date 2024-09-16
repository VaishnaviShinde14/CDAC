package assignment4;

import java.util.Scanner;

class BMITracker{
	
	double weight;
	double height;
	double BMI;
	String Bmitype;

	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI() {
		return BMI;
	}
	public String getBmitype() {
		return Bmitype;
	}
	
	
	void calculateBMI() {
		 this.BMI= weight / (height*height);	 
	}
	
	void classifyBMI() {
		
		if (this.BMI < 18.5) {
			this.Bmitype = "Underweight";
		}
		else if (18.5 < this.BMI && this.BMI < 24.9) {
			this.Bmitype = "Normalweight";
		}
		else if (25 < this.BMI && this.BMI < 29.9) {
			this.Bmitype = "Overweight";
		}
		else {
			this.Bmitype = "Obese";
		}
	}
}
	
class BMITrackerUtil {
	BMITracker bmi = new BMITracker();
	Scanner sc = new Scanner(System.in);
	
	void acceptRecord() {
		
		System.out.println("Enter weight");
		bmi.setWeight(sc.nextDouble());
		System.out.println("Enter height");
		bmi.setHeight(sc.nextDouble());
	}
	
	void printRecord() {
		bmi.calculateBMI();
		bmi.classifyBMI();
		System.out.println("BMI is" +bmi.getBMI());
		System.out.println("So you are " +bmi.getBmitype());
	}
	 
	 public int choice() {
			System.out.println("enter 1 for setting values");
			System.out.println("enter 2 for printing values");
			System.out.println("enter 0 for to exit ");
			int choice =sc.nextInt();
			return choice;	
		}
}
	
public class Program3 {

	public static void main(String[] args) {
		BMITrackerUtil butil = new  BMITrackerUtil();
	
		int a ;
		while((a = butil.choice())!=0) {
			switch(a) {
			case 1:butil.acceptRecord();
			break;
			case 2:butil.printRecord();
			break;
			}

	}

}
}

