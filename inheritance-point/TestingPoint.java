package part1;

/*
 * @author Alexander Kemos
 * @version 1.0
 * @
 */

/*
 * This driver creates instances of Point and Point3D
 * and tests their behavior.
 */



public class TestingPoint {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point();
		Point p3 = new Point(p1);

		Point3D pd3 = new Point3D(2,5,1);
		Point3D pd0 = new Point3D();
		Point3D pd1 = new Point3D(1,3,2);
		Point3D pd4 = new Point3D(pd3);
		
		System.out.println(p1.computeDistance(p2));
		System.out.println(p1.computeDistance(0, 0));
		System.out.println(p3);
		
		System.out.println(pd4);
		System.out.println(pd0);
		System.out.println(pd0.computeDistance(2, 5, 1));
		System.out.println(pd1.computeDistance(pd3));
		

	}
}
