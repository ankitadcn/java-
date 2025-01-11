import java.util.*;

//for loop use in scanner
public class Forloop2n {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i * n);
    }
    /*
     * direct use in for loop
     * for (int i = 1; i <= 10; i++) {
     * System.out.println(2*i);
     * }
     */
  }
}
