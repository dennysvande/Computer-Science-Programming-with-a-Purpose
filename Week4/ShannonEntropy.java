public class ShannonEntropy {
  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);
    int counter = 0, n =0;
    int[] x = new int[m + 1];
    double entropy = 0.0;
    double[] pi = new double[m + 1];
    pi[0] = 0;
    x[0] = 0;

    while (!StdIn.isEmpty()) {
      n = StdIn.readInt();
      x[n]++;
      counter++;
    }

    for (int i = 1; i < x.length; i++) {
      if (x[i] == 0) {
        pi[i] = 0;
      }
      else {
        pi[i] = (double) x[i] / (double) counter;
      }

      if (pi[i] == 0) {
        entropy = entropy + 0;
      }
      else {
        entropy = entropy + (pi[i] * (Math.log(pi[i]) /  Math.log(2)));
      }
    }
    StdOut.printf("%.4f\n", -entropy);
  }
}
    
