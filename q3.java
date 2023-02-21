// What is the largest prime factor of the number 600851475143?
class q3 {
	public static void main(String[] args) {
			System.out.println(largestPrimeFactor(600851475143L)); // 6857
	}
	public static long largestPrimeFactor(long x) {
		if (x <= 1 || x == 2 || x == 3) {
			return x;
		}
		for (long i = 2; i < x/2; i++) {
			if (x % i == 0) {
				if (isPrime(x/i)) {
					return x/i;
				}
			}
		}
		return x;
	}
	public static Boolean isPrime(long x) {
		if (x <= 1 || x % 2 == 0) {
			return false;
		}
		for (long i = 2; i < x/2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
