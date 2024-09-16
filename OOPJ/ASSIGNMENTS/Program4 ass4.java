package assignment4;

import java.util.Scanner;

class DiscountCalculator {
	private double ogprice;
	private double dispercnt;
	private double disamount;
	private double finalprice;
	
	
	public double getOgprice() {
		return ogprice;
	}
	public void setOgprice(double ogprice) {
		this.ogprice = ogprice;
	}
	public double getDispercnt() {
		return dispercnt;
	}
	public void setDispercnt(double dispercnt) {
		this.dispercnt = dispercnt;
	}
	
	
	public double getDisamount() {
		return disamount;
	}
	public double getFinalprice() {
		return finalprice;
	}
	
	void calculateDiscount(){
		this.disamount = ogprice * (dispercnt / 100);
		this.finalprice = ogprice - disamount;
	}
	
}	
class CalculatorUtil{
	DiscountCalculator dsc= new  DiscountCalculator();
	Scanner sc = new Scanner (System.in);
	
	void acceptRecord() {
		System.out.println("Enter original price");
		dsc.setOgprice(sc.nextDouble());
		System.out.println("Enter discount percentage");
		dsc.setDispercnt(sc.nextDouble());
	}
	
	void printRecord()
	{
		dsc.calculateDiscount();
		System.out.println("Discount amount is " +dsc.getDisamount());
		System.out.println("Final price is " +dsc.getFinalprice());
	}
	
	 public int choice() {
			System.out.println("enter 1 for setting values");
			System.out.println("enter 2 for printing values");
			System.out.println("enter 0 for to exit ");
			int choice =sc.nextInt();
			return choice;	
		}
	
}

public class Program4 {

	public static void main(String[] args) {
	
		CalculatorUtil coc = new CalculatorUtil();
		
		int a ;
		while((a = coc.choice())!=0) {
			switch(a) {
			case 1:coc.acceptRecord();
			break;
			case 2:coc.printRecord();
			break;
			}

	}
		
	}

	}
