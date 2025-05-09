package part2;

/**
 * @author Alexander Kemos
 * @version 1.0
 * @since
 */

/*
 * The Irrational interface provides three methods to approximate a specific value. 
 * From a performance standpoint, these methods should be used with caution. 
 * In many implementations they will perform costly O(n) loops.
 */

public interface Irrational {
	
	//Compute PI using Leibniz formula
	public double computePI(int precision );
	
	//Compute E using eulers Sum formula.
	public double computeEulerConstant(int precision );
	
	//Compute approximation of √2 using Babylonian method
	public double computeSquareRootOfTwo(int precision );
}
