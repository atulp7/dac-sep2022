
public class Q1 {
  public static void main(String[] args) {

    int size = 5;
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < size - i - 2; j++) {
        System.out.print(" ");
      }
      // print number
      int num = 1;
      for (int k = 0; k < 2 * i + 2 ; k++) {
        if (i == 0 || i == size - 1) {
          System.out.print(num++);
        } else {
          if (k == 0 || k == 2 * i) {
            System.out.print(num++);
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}


/*

   12
  1 2
 1   2
1     2
123456789


*/