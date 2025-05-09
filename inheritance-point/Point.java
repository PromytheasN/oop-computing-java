package part1;
import java.lang.Math;
import java.lang.String;

/*
 * @author Alexander Kemos
 * @version 1.0
 * @since 
 */

/*
 * The Point class represents a point in a two dimensional field,
 * with x and y coordinates.
 * The class Point includes methods for computing the Euclidean distance between this point and 
 * another point or coordinates, for getting or setting the coordinates of X and Y of this point and
 * for printing a representation of this point in the form (X, Y).
 */

public class Point {
	//The X coordinate field of this Point
	protected double x;
	//The Y coordinate field of this Point
	protected double y;
	
	//Getters and setters for X and Y coordinates
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//Default constructor
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	//Two parameter constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Constructor with one parameter P that
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	//Compute the Euclidean distance between this point and point with (x, y) coordinates 
	public double computeDistance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y, 2));
	}
	
	//Compute the Euclidean distance between this point and point p
	public double computeDistance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
	}
	//Return string representation of point in the form (x,y)
	public String toString() {		
		return String.format("(%.2f, %.2f)", this.x, this.y);
	}
	
}
