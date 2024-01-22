// Program to showcase the usage of parameterized ctors
// TArun
// 230970005
// 15/08/2024

class Box
{
	float width,height,depth;
	public Box()
	{
		width = height = depth = 0;
	}
	public Box(float w,float h,float d)
	{
		width = w; height = h; depth = d;
	}
	public void calcVolume()
	{
		float volume = width * height * depth;
		System.out.println("The volume of the box is: "+volume);
	}
}
public class Cube
{
	public static void main(String args[])
	{
		Box b = new Box(20.5f,12.0f,14.3f);
		b.calcVolume();
	}
}