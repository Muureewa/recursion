class Main {
  public static void main(String[] args) {

    System.out.println(matchDigits(12, 132542));

    
    multiplyEvens(1);
    multiplyEvens(4);

    
  }


  public static int matchDigits(int x, int y) {
    if (x < 0 || y < 0) {
      throw new IllegalArgumentException("x and y must be non-negative");
    }
    if (x == 0 && y == 0) {
      return 1;
    }
    if (x == 0 || y == 0) {
      return 0;
    }
    if (x % 10 == y % 10) {
      return matchDigits(x / 10, y / 10) + 1;
    }
      return matchDigits(x / 10, y / 10);
    }

  
  public static int multiplyEvens(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("n must be greater than 0");
    } else if (n == 1) {
      return 2;
    } else {
    return 2 * n * multiplyEvens(n-1);
    }
  }

  
}