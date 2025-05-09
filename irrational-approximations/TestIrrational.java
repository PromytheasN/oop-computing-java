package part2;

/**
 * @author Alexander Kemos
 * @version 1.0
 * @since
 */

/*
 * This driver creates an instance of the IrattionalApprocimation Class
 * and test it's behavior.
 */

public class TestIrrational {
	public static void main(String[] args) {
		
		IrrationalApproximation obj = new IrrationalApproximation();
		System.out.println(obj.computePI(999999));
		System.out.println(obj.computeEulerConstant(999999));
		System.out.println(obj.computeSquareRootOfTwo(33333));
	}
}
