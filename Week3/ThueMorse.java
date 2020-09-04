public class ThueMorse {
  public static void main(String[] args) {
    
    int n = Integer.parseInt(args[0]);
    int counter = 0;
    int[] bits = new int[n * n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (counter == 0) {
          bits[counter] = 0;
          StdOut.print(" + ");
        }
        else if (counter % 2 == 0) {
          bits[counter] = bits[counter / 2];
          if (bits[counter] == 0) {
            StdOut.print(" + ");
          }
          else if (bits[counter] == 1) {
            StdOut.print(" - ");
          }
        }
        else {
          bits[counter] = 1 - bits[counter - 1];
          if (bits[counter] == 0) {
            StdOut.print(" + ");
          }
          else if (bits[counter] == 1) {
            StdOut.print(" - ");
          }
        }
        counter++;
      }
      StdOut.println();
    }
  }
}
