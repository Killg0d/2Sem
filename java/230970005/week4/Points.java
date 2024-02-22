//tarun
//230970005
//05-02-2024
import java.util.Scanner;

class Cordinates {
    private static int count = 0;
    int id;
    int x, y;
    Scanner sc = new Scanner(System.in);

    Cordinates() {
        x = 0;
        y = 0;
        id=++count;
    }

    public void getPoints() {
        System.out.print("Input the coordinates of P" + id + ": ");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(Cordinates c) {
        return Math.sqrt(Math.pow((c.x - this.x), 2) + Math.pow((c.y - this.y), 2));
    }
    public void showPoints()
    {
      System.out.println("P"+(id)+"= ("+x+","+y+")");
    }
}

class Points {
    public static void main(String args[]) {

        Cordinates p1 = new Cordinates();
        Cordinates p2 = new Cordinates();
        Cordinates p3 = new Cordinates();
        p1.getPoints();
        p2.getPoints();
        p3.getPoints();
        p1.showPoints();
        p2.showPoints();
        p3.showPoints();
        System.out.println("Distance between P1 and P2: "+p1.distance(p2));
        System.out.println("Distance between P1 and P3: "+p1.distance(p3.x, p3.y));
    }
}