package part1;

/*
 * @author Alexander Kemos
 * @version 1.0
 * @
 */

/*
 * The Point3D class extend point class.
 * It represents a 3D point in a three dimensional field,
 * with x, y and z coordinates.
 * The class Point includes methods for computing the Euclidean distance between this 3D point and 
 * another 3D point or coordinates (x, y, z), for getting or setting the coordinates of X, Y and Z 
 * of this point and for printing a representation of this point in the form (X, Y, Z).
 */
public class Point3D extends Point{
	
	//The Z coordinates field
	protected double z;
	//Get z coodrdinates
	public double getZ() {
		return this.z;
	}
	//Set z coordinates
	public void setZ(double z) {
		this.z = z;
	}
	//Initialize point at coordinates 0,0,0
	public Point3D() {
		super();
		this.z = 0;
	}
	//Initialize a point at coordinates x,y,z
	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;	
		
	}
	//Initialize a point at same coordinates with instance Point3d p
	public Point3D(Point3D p) {
		super(p);
		this.z = p.z;
	}
	//Compute the Euclidean distance between this point
	//and 3D point with (x, y, z) coordinates.
	public double computeDistance(double x, double y, double z) {
		return Math.sqrt(Math.pow(super.computeDistance(x, y),2) 
						+ Math.pow(this.z-z,2));
	}
	
	//Compute the Euclidean distance between this point and 3D point p 
	public double computeDistance(Point3D p) {
		return Math.sqrt(Math.pow(super.computeDistance(p), 2) 
						+ Math.pow(this.z - p.getZ(), 2));
	}
	//Return a string representation of this 3D point in the format (x, y, z)
	public String toString() {
		return super.toString().substring(0, super.toString().length()-1) 
						+ String.format(", %.2f)", z);
	}
	
}
