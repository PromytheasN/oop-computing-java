package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;

public abstract class Fibonacci {
	public BigInteger usingRecursion(int n) {
		BigInteger fibonacci = BigInteger.valueOf(n);
		if (n <= 1) {
			return fibonacci;
		}
		return usingRecursion(n - 1).add(usingRecursion(n - 2));
	}

	public abstract BigInteger usingIteration(int n);

	public abstract BigInteger usingTailRecursion(int n, BigInteger a, BigInteger b);

	public abstract BigInteger usingMemoization(int n, HashMap<Integer, BigInteger> cache);

}
