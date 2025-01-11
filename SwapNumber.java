import java.util.Scanner;

class SwapNumber {
  public static void main(String args[])

  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome  the Swapping number\n");

    System.out.println("Enter the Swap number A is:");
    int a = sc.nextInt();

    System.out.println("Enter the Swap number B is:");
    int b = sc.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("value is A number:" + a);
    System.out.println("value is b number:" + b);
  }
}