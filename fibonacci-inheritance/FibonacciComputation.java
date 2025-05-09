package fibonacci;

/*
 * @author Alexander Kemos
 * @version 1.0
 * @since
 */

/*
 * The FibonacciComputarion class extends Fibonacci abstract class.
 * It includes three methods that calculate the Nth Fibonnacci number.
 * It includes the method usingTailRecursion that calculates it using tail recursion,
 * the method usingIntegration that calculates the Fibonacci using integration and
 * the method usingMemoization that calculates the Fibonacci using memoization.
 */

import java.math.BigInteger;
import java.util.HashMap;

public class FibonacciComputation extends Fibonacci {
	@Override
	public BigInteger usingIteration(int n) {
		BigInteger fb, a, b;
		fb = a = b = BigInteger.valueOf(1);
		for (int i = 3; i <= n; i++) {
			b = a;
			a = fb;
			fb = a.add(b);
		}
		return fb;
	}

	@Override
	public BigInteger usingTailRecursion(int n, BigInteger a, BigInteger b) {
		// Base case
		if (n <= 0) {
			return a;
		}
		if (n == 1 ) {
			return b;
		}
		return usingTailRecursion(n - 1, b, a.add(b));
	}

	@Override
	public BigInteger usingMemoization(int n, HashMap<Integer, BigInteger> cache) {
		
		// Populate hashmap values for case n=0,1,2
		cache.put(0, BigInteger.valueOf(0));
		cache.put(1, BigInteger.valueOf(1));
		cache.put(2, BigInteger.valueOf(1));

		// Check if contains key
		if (cache.containsKey(n)) {
			System.out.println("Printing from storred values: ");
			return cache.get(n);
		}
		cache.put(n, cache.get(n - 1).add(cache.get(n - 2)));
		return cache.get(n);
	}
}