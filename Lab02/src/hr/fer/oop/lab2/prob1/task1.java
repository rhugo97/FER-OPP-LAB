package hr.fer.oop.lab2.prob1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		if(args.length != 0) {
			if(args.length != 2) {
				System.out.println("Invalid number of arguments was provided.");
				System.exit(0);
			}
			System.out.println("Width: " + args[0]);
			double width= Double.parseDouble(args[0]);
			if( width <= 0) {
				System.out.println("The width must not be negative.");
			}
			System.out.println("Heigth: " + args[1]);
			double height = Double.parseDouble(args[1]);
			if( height <= 0) {
				System.out.println("The height must not be negative.");
			}
			calculate(width,height);
		}
		else {
			String str = null;
			double width=0;
			double height=0;
			java.io.BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
			System.out.print("Please provide width: ");
			str=in.readLine();
			if(str.isEmpty()) {
				while(str.isEmpty()) {
					System.out.println("The width must not be blank.");
					System.out.print("Please provide width: ");
					str=in.readLine();
				}
			}
			width=Double.parseDouble(str);
			if(width <= 0) {
				while(width<=0) {
					System.out.println("The width must be positive.");
					System.out.print("Please provide width: ");
					str=in.readLine();
					width=Double.parseDouble(str);
				}
				
			}
			System.out.println("Width: " + width);
			str=null;
			System.out.print("Please provide height: ");
			str=in.readLine();
			if(str.isEmpty()) {
				while(str.isEmpty()) {
					System.out.println("The height must not be blank");
					System.out.print("Please provide height: ");
					str=in.readLine();
				}
			}
			height=Double.parseDouble(str);
			if(height <= 0) {
				while(height <= 0) {
					System.out.println("The height must be positive.");
					System.out.print("Please provide height: ");
					str=in.readLine();
					height=Float.parseFloat(str);
				}
			}
			System.out.println("Height: " + height);
			calculate(width,height);
		}
		
	}
	public static void calculate(double width, double height) {
		double perimeter = width + height;
		double area = width * height;
		System.out.println("You have specified a rectangle of width "+ width +" and height " + height + ". Its area is " + area + " and its perimeter is " + perimeter + ".");
	}
}
