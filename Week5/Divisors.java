public class Divisors {

  // Returns the greatest common divisor of a and b.
  public static int gcd(int a, int b) {
    int x = Math.abs(a);
    int y = Math.abs(b);
    int temp = 0;

    while (y != 0) {
      temp = x;
      x = y;
      y = temp % y;
    }

    return x;
  }

  // Returns the least common multiple of a and b.
  public static int lcm(int a, int b) {
    return (Math.abs(a) * Math.abs(b)) / gcd(a, b);
  }

  // Returns true if a and b are relatively prime; false otherwise.
  public static boolean areRelativelyPrime(int a, int b) {
    if (gcd(a, b) == 1) return true; else return false;
  }

  // Returns the number of integers between 1 and n that are
  // relatively prime with n.
  public static int totient(int n) {
    int counter = 0;
    if (n <= 0 ) return 0;
    else {
      for (int i = 1; i <= n; i++) {
        if (areRelativelyPrime(i, n)) counter++;
      }
    }
    return counter;
  }

  // Takes two integer command-line argumnets a and b prints
  // each function, evaluated in the format (and order) given below.
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    StdOut.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
    StdOut.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
    StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
    StdOut.println("totient(" + a + ") = " + totient(a));
    StdOut.println("totient(" + b + ") = " + totient(b));
  }
}
