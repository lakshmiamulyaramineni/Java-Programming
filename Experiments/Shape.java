//EXPERIMENT-11

public class Shape
{
	int n1,n2;
	
	void printArea() 
	{
	
	}
	
	
	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle();
		rectangle.n1 = 4;
		rectangle.n2 = 5;
		rectangle.printArea();
		
		Triangle triangle = new Triangle();
		triangle.n1 = 4;
		triangle.n2 = 5;
		triangle.printArea();
		
		Circle circle = new Circle();
		circle.n1 = 4;
		circle.printArea();
	}
}

class Rectangle extends Shape 
{
	void printArea() 
	{
		//n1 = width,n2=Length
		System.out.println("Area of Rectangle: " + n1 * n2);
	}
}

class Triangle extends Shape 
{
	void printArea() 
	{
		//n1 = Height, n2 = Base
		System.out.println("Area of Rectangle: " + n1 * (n2 / 2));
	}
}

class Circle extends Shape 
{
	void printArea() 
	{
		//n1 = radius, n2 = NULL
		System.out.println("Area of Rectangle: " + Math.PI * n1 * n1);
	}
}

