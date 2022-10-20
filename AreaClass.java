package AreaPackage;

import java.util.Scanner;

/*
 * <h1>Area of different shapes</h1>
 * AreaClass program implements an application that returns the area of the give shape which is mentioned
 * by the user
 * 
 * @author Abhinav Singh
 * @version 1.0
 * @since 18-10-2022
 */

public class AreaClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 1;
		
		AreaCalculation obj = new AreaCalculation();
		
		//Interface for selecting the type of shapes which user wants to calculate the area of
		while(option != 0)
		{	
			System.out.println("Enter the shape : ");
			System.out.println("1. Triangle\n"+"2. Rectangle\n"+"3. Square\n"+"4. Circle\n");
			option = sc.nextInt();
			switch(option)
			{
				case 1 :
					System.out.println("Enter the Height : \n");
					double height = sc.nextDouble();
					System.out.println("Enter the Base : \n");
					double base = sc.nextDouble();
					System.out.println("Area of the triangle is : " +obj.triangleArea(height, base));
					System.out.println("\n");
					break;
				case 2 :
					System.out.println("Enter the Length : \n");
					double length = sc.nextDouble();
					System.out.println("Enter the Width : \n");
					double width = sc.nextDouble();
					System.out.println("Area of the rectangle is : " +obj.rectangleArea(length, width));
					System.out.println("\n");
					break;
				case 3 :
					System.out.println("Enter the Side : \n");
					double side = sc.nextDouble();
					System.out.println("Area of the square is : " +obj.squareArea(side));
					System.out.println("\n");
					break;
				case 4 :
					System.out.println("Enter the Radius : \n");
					double radius = sc.nextDouble();
					System.out.println("Area of the circle is : " + obj.circleArea(radius));
					System.out.println("\n");
					break;
				default:
					break;				
			}	
		}	
	}

}
