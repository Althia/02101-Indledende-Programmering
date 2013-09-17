package uge3;

import java.awt.Point;

public class Opgave3_6 {
	public static void main(String[] args) {
		Point point1 = new Point(3,4);
		Point point2 = new Point(5,6);
		System.out.println("points before swap: (" + point1.x + ", " + point1.y + ") and (" + point2.x + ", " + point2.y + ")");
		swapPoints(point1, point2);
		System.out.println("points after swap: (" + point1.x + ", " + point1.y + ") and (" + point2.x + ", " + point2.y + ")");
	}
	public static void swapPoints(Point p1, Point p2) {
		Point new1 = new Point(p1.x, p1.y);
		p1.x = p2.x;
		p1.y = p2.y;
		p2.x = new1.x;
		p2.y = new1.y;
	}
}
