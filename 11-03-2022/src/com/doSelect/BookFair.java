package com.doSelect;

import java.util.Scanner;

public class BookFair
{
	String Bname;
	double price;
	double discount;
	double amount;
	public BookFair()
	{
		Bname="";
		price=0.00;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Name of Book:");
	    Bname=sc.nextLine();
	    System.out.println("Enter the price of book");
	    price=sc.nextDouble();
	}
	void calculate()
	{
		if(price<=1000)
		{
			discount=(price*2)/100;
			amount=price-discount;
		}
		else if(price>1000&&price<=3000)
		{
			discount=(price*2)/100;
			amount=price-discount;

		}
		else if(price>3000)
		{
			discount=(price*2)/100;
			amount=price-discount;

		}
	}
	void display()
	{
		System.out.println("WELCOME TO BOOK FAIR");
		System.out.println("NAME OF THE BOOK:  "+Bname);
		System.out.println("PRICE OF THE BOOK: "+price);
		System.out.println("DISCOUNT IS :   "+discount);
		System.out.println("TOTAL AMOUNT;   "+amount);
	}

	public static void main(String[] args) 
	{
	    BookFair bf=new BookFair();
	    bf.input();
	    bf.calculate();
	    bf.display();

	}

}
