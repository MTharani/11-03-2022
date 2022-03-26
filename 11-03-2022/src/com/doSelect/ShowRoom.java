package com.doSelect;

import java.util.Scanner;

public class ShowRoom 
{
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	public ShowRoom() 
	{
		 name="";
		 mobno=00000000l;
	     cost=0.000000;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("Enter the Mobile Number");
		mobno=sc.nextLong();
		System.out.println("enter the cost");
		cost=sc.nextDouble();
		
	}
	void calculate()
	{
		if(cost<=10000)
		{
		     dis=(cost*5)/100;
		     amount=cost-dis;

		}
		else if(cost>10000&&cost<=20000)
		{
			dis=(cost*10)/100;
			amount=cost-dis;
			
		}
		else if(cost>20000&&cost<=35000)
		{
			dis=(cost*15)/100;
			amount=cost-dis;
	
		}
		else if(cost>35000)
		{
			dis=(cost*20)/100;
			amount=cost-dis;

		}
			
	}
	void display()
	{
	    System.out.println("THE SHOW ROOM BILL");	
		System.out.println("NAME OF THE CUSTOMER:  "+name);
		System.out.println("MOBILE NUMBER IS:  "+mobno);
		System.out.println("COST OF THE PURCHASED ITEMS:  "+cost);
		System.out.println("discount is:"+dis);
		System.out.println("amount is:"+amount);
		
	}

	public static void main(String[] args) 
	{
		ShowRoom sr=new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();

	}

}
