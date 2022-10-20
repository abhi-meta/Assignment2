package AreaPackage;

/*
 * <h1>Area Calculation Class</h1>
 * This class consist of methods which calculate area of different shapes - 
 * 1. Triangle Area 
 * 2. Rectangle Area
 * 3. Square Area
 * 4. Circle Area
 */

public class AreaCalculation {
	
	/*
	 * trianleArea method Calculates the area of an triangle 
	 * @param height is the first argument 
	 * @param base is the second argument
	 * @return The area of triangle by the formula 0.5*base*height
	 */
	
	public double triangleArea(double height,double base)
	{
		return 0.5*height*base;
	}
	
	/*
	 * rectangleArea method Calculates the area of an rectangle 
	 * @param length is the first argument 
	 * @param width is the second argument
	 * @return The area of rectangle by the formula length*width
	 */
	
	public double rectangleArea(double length, double width)
	{
		return length*width;
	}
	
	/*
	 * squareArea method Calculates the area of an square 
	 * @param side is the first argument 
	 * @return The area of square by the formula side*side
	 */
	
	public double squareArea(double side)
	{
		return side*side;
	}
	
	/*
	 * circleArea method Calculates the area of an circle 
	 * @param radius is the first argument 
	 * @return The area of circle by the formula 22/7*radius*radius
	 */
	
	public double circleArea(double radius)
	{
		return (3.14*radius*radius);
	}
	
	
}
