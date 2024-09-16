package assignment4;

import java.util.Scanner;

class TollBoothRevenueManager{
	double cartoll;
	double trucktoll;
	double motortoll;
	double noofcar;
	double nooftruck;
	double noofmotor;
	double totalnoofvehicles;
	double totalrevenue;
	
	public double getCartoll() {
		return cartoll;
	}
	public void setCartoll(double cartoll) {
		this.cartoll = cartoll;
	}
	public double getTrucktoll() {
		return trucktoll;
	}
	public void setTrucktoll(double trucktoll) {
		this.trucktoll = trucktoll;
	}
	public double getMotortoll() {
		return motortoll;
	}
	public void setMotortoll(double motortoll) {
		this.motortoll = motortoll;
	}
	public double getNoofcar() {
		return noofcar;
	}
	public void setNoofcar(double noofcar) {
		this.noofcar = noofcar;
	}
	public double getNooftruck() {
		return nooftruck;}
	
	public void setNooftruck(double nooftruck) {
		this.nooftruck = nooftruck;}
	
	public double getNoofmotor() {
		return noofmotor;}
	
	public void setNoofmotor(double noofmotor) {
		this.noofmotor = noofmotor;}
	
	public double getTotalnoofvehicles() {
		return totalnoofvehicles;}
	
	public double getTotalrevenue() {
		return totalrevenue;}
	
	public void calculateRevenue() {
		this.totalnoofvehicles = this.noofcar+this.nooftruck+this.noofmotor;
		this.totalrevenue =(this.cartoll*this.noofcar)+(this.trucktoll*this.nooftruck)+(this.motortoll*this.noofmotor);
		}
		
}

class TollBoothRevenueManagerUtil{
	TollBoothRevenueManager tbr = new TollBoothRevenueManager();
    Scanner sc = new Scanner(System.in);
	
	void acceptRecord() {
		
		System.out.println("Enter number of cars");
		tbr.setNoofcar(sc.nextDouble());
		System.out.println("Enter number of motors");
		tbr.setNoofmotor(sc.nextDouble());
		System.out.println("Enter number of trucks");
		tbr.setNooftruck(sc.nextDouble());
		System.out.println("Enter toll for cars");
		tbr.setCartoll(sc.nextDouble());
		System.out.println("Enter toll for motors");
		tbr.setMotortoll(sc.nextDouble());
		System.out.println("Enter toll for trucks");
		tbr.setTrucktoll(sc.nextDouble());
		
	}
	
	void printRecord() {
		tbr.calculateRevenue();
		System.out.println("total number of vehicle is " +tbr.getTotalnoofvehicles());
		System.out.println("total revenue is " +tbr.getTotalrevenue());
	}
	 
	 public int choice() {
			System.out.println("enter 1 for setting values");
			System.out.println("enter 2 for printing values");
			System.out.println("enter 0 for to exit ");
			int choice =sc.nextInt();
			return choice;	
		}
	
}

public class Program5 {
	
	public static void main(String[] args) {
	TollBoothRevenueManagerUtil tbrutil = new TollBoothRevenueManagerUtil();
	
	int a ;
	while((a = tbrutil.choice())!=0) {
		switch(a) {
		case 1:tbrutil.acceptRecord();
		break;
		case 2:tbrutil.printRecord();
		break;
		}
		}
}
}
