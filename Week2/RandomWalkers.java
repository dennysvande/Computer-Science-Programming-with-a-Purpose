public class RandomWalkers {
  public static void main(String[] args) {
    
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int x = 0, y = 0, steps = 0;
    double avgSteps = 0.0;

    for (int i = 0; i < trials; i++) {
      while (Math.abs(x) + Math.abs(y) != r) {
        double n = Math.random();
        if (n < 0.25) x--;
        else if (n < 0.50) x++;
        else if (n < 0.75) y--;
        else if (n < 1.00) y++;
        steps++;
      }
      avgSteps += steps;
    }
    System.out.println("average number of steps = " + avgSteps/trials);
  }
}
