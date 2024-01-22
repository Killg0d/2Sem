class Point
{
	protected int x, y;
	Point(int x,int y)
	{
		this.x=x;this.y=y;
	}
}

class Distance
{
	double dist;
	Distance(Point p1,Point p2)
	{
		dist=Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
		System.out.println(dist);
	}
	public static void main(String args[])
	{
		Point p1=new Point(2,3);
		Point p2=new Point(1,4);
		Point p3=new Point(3,5);
		Distance d1=new Distance(p1,p2);
		Distance d2=new Distance(p1,p3);
	}
}