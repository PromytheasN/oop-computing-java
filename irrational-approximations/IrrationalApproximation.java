package part2;


/*
 * @author Alexander Kemos
 * @version 1.0
 * @since
 */

/*
 * The IrrationalApproximation class implements the interface irrational.
 * It represents an object that includes methods for 
 * calculating an aproximation the value of PI, Eulers number,
 * and √2 according to given precision.
 */


public class IrrationalApproximation implements Irrational{

	//Compute PI using Leibniz formula with Sigma Sum Notation n = precision;
	@Override
	public double computePI(int precision) {
		double leibniz = 0;
		double num = 1;
		for(int i = 1; i <= precision; i++) {
			if(i%2 == 0) {
				num += 1/((double)i*2+1);
			}else {
				num -= 1/((double)i*2+1);
			}
		}
		leibniz = 4*num;
		return leibniz;
	}

	//Compute E using eulers Sum formula with Sum Notation n = precision;
	@Override
	public double computeEulerConstant(int precision) {
		double e = 0;
		double fact = 1;
		for(int i = 0; i < precision; i++) {
			if(i != 0) {
				fact *= (double)i;
			}
			e += 1/fact;
		}
		return e;
	}

	//Compute approximation of √2 using Babylonian method and n = precision
	@Override
	public double computeSquareRootOfTwo(int precision) {
		double result = 1.4;
		if(precision == 0) {
			return result;
		}
		for (int i = 0; i <= precision; i++) {
			result = (result + 2/result)/2;
		}
		return result;
	}

}
