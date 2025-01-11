import java.util.Scanner;

public class GreaterNO {
  public static void main(String[] args) {
    int x, y, z;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    x = sc.nextInt();
    System.out.println("Enter second number");
    y = sc.nextInt();
    System.out.println("Enter third number");
    z = sc.nextInt();
    int greater = x;
    if (y > greater) {
      greater = y;
    }
    if (z > greater) {
      greater = z;
    }
    System.out.println("the greater number is:" + greater);
  }
}
