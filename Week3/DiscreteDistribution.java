public class DiscreteDistribution {
  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);
    int n = args.length - 1;
    int r = 0;
    int sum = 0;
    int[] s = new int[args.length];
    int[] a = new int[args.length];
    s[0] = 0;

    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(args[i+1]);
    }

    for (int i = 0; i < n; i++) {
      sum += a[i];
      s[i+1] = sum;
    }

    for (int i = 0; i < m; i++) {
      r = (int) (Math.random() * s[n]);
      for (int j = 0; j < n; j++) {
        if (r < s[j + 1] && r >= j) {
          System.out.print((j + 1) + " ");
        }
      }
    }
    System.out.println();
  }
}
