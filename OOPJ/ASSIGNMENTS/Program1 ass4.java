package assignment4;

import java.util.Scanner;

class Cal{
	private float rate;
	private float term;
	private double monthlyPayment;
	private double principal;
	private double totalAmountPaid;
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTerm() {
		return term;
	}
	public void setTerm(float term) {
		this.term = term;
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void cal() {
		monthlyPayment = principal * 
				 ((rate/1200) * 
				 Math.pow((1 + (rate/1200)),((float)term)*12)) 
				 / (Math.pow((1 + (rate/1200)),((float)term)*12) - 1);
		 totalAmountPaid = monthlyPayment * term * 12;
	}
	
}
class CalUtill{
	Cal c=new Cal();
	static Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		c.setPrincipal(sc.nextFloat());
		c.setRate(sc.nextFloat());
		c.setTerm(sc.nextFloat());
	}
	public void printRecord() {
		c.cal();
		System.out.println(c.getMonthlyPayment());
		System.out.println(c.getTotalAmountPaid());
	}
	public int choice() {
		System.out.println("enter 1 for setting values");
		System.out.println("enter 2 for printing values");
		System.out.println("enter 0 for to exit ");
		int choice =sc.nextInt();
		return choice;
		
	}
}
public class Program1 {

	public static void main(String[] args) {
		CalUtill c1=new CalUtill();
		int choice ;
		while((choice = c1.choice())!=0) {
			switch(choice) {
			case 1:c1.acceptRecord();
			break;
			case 2:c1.printRecord();
			break;
			}
		}
		CalUtill.sc.close();
	}

}