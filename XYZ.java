import java.util.*;
class Box
{
	double width,length,height;
Box(double width,double length,double height)
	{
		this.width = width;
		this.length = length;
		this.height = height;
	}
double volume()
	{
		return width*length*height;
	}	
}

class XYZ
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of width: ");
		double width = sc.nextDouble();

		System.out.println("Value of Length: ");
		double length = sc.nextDouble();

		System.out.println("Value of height: ");
		double height = sc.nextDouble();

		Box v = new Box(width, length, height);

		double vol = v.volume();
		System.out.println("The volume of the box is: " + vol);
	}
}