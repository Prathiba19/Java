
public class Box {
	double width;
	double length;
	double height;
    double r;
	Box(double width,double length,double height)
	{
		this.width=width;
		this.length=length;
		this.height=height;
	}
	public double volume()
	{
		return width*length*height;
	}

	public static void main(String[] args) {
		Box b1=new Box(10.0,20.0,30.0);
		System.out.print("Volume of the box:");
		System.out.println(b1.volume());

	}

}
