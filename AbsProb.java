
import static java.lang.System.out;
abstract class Shape
{
	abstract void area();
	abstract void show();
} 

class Circle extends Shape
{
	int RADIUS=5;
	double PI=3.14;
	double area;
	void area()
	{
		area=PI*RADIUS*RADIUS;
	}
	void show()
	{
		out.println("Area of Circle : "+area);
	}
}

class Triangle extends Shape
{
	int BASE=5;
	int HEIGHT=12;
	int area;
	void area()
	{
		area=BASE*HEIGHT/2;
	}
	void show()
	{
		out.println("Area of Triangle : "+area);
	}
}

class Rectangle extends Shape
{
	int LENGTH=5;
	int WIDTH=10;
	int area;
	void area()
	{
		area=LENGTH*WIDTH;
	}
	void show()
	{
		out.println("Area of Rectangle : "+area);
	}
}


class Main
{
	public static void main(String[] args)
	{
		Shape obj1=new Circle();
		obj1.area();
		obj1.show();

		Shape obj2=new Triangle();
		obj2.area();
		obj2.show();

		Shape obj3=new Rectangle();
		obj3.area();
		obj3.show();

	}
}