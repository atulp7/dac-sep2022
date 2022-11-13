public class Q4 {

  public static void main(String[] args) {
    int rows = 5, c = 1;

    for(int i = 0; i < rows; i++) {
      for(int space = 1; space < rows - i; ++space) {
        System.out.print("  ");
      }

      for(int j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          c = 1;
        else
          c = c * (i - j + 1) / j;

        System.out.printf("  "+ c+" ");
		//System.out.printf("%4d", c);
      }

      System.out.println();
    }
  }
}


/*

          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
  
  
  */