import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.err.println("Enter First Number");
    int a = sc.nextInt();

    System.err.println("Enter Second Number");
    int b = sc.nextInt();

    System.err.println("Enter Third Number");
    int c = sc.nextInt();

    // Logic-1

    if (a > b && a > c) {
      System.out.println(a + "is larger number");
    } else if (b > a && b > c) {
      System.out.println(b + "is ;arger number");
    } else {
      System.out.println(c + "is larger number");
    }

    // Logic-2 Ternaray Operator

  }
}
