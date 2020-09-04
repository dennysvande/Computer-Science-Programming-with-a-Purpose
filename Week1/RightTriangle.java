public class RightTriangle {
  public static void main(String[] args) {

    boolean isRightTriangle;
    boolean isPositive;
    boolean check1, check2, check3;

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    check1 = ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2));
    check2 = ((Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2));
    check3 = ((Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2));

    isPositive = (a >= 0 && b >= 0 && c >= 0);
    isRightTriangle = check1 || check2 || check3 && isPositive;

    System.out.println(isRightTriangle);

  }
}
