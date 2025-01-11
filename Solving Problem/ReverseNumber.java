import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number"); // 1234

    int num = sc.nextInt();

    // 1. using algorithm
    // int rev = 0;
    // while (num != 0) {
    // rev = rev * 10 + num % 10; // 0*10+1234%10, 0+4=4 4*10+3=43 43*10+2=432
    // 432*10+1=4321

    // num = num / 10; // 1234/10=123 123/10=12 12/10=1 1/10=0 this is a reverse

    // System.out.println("Reverse number is:" + rev);
    // }
    // -----------------------------------------------------------------------

    // 2.Using Stringbuffer class

    // StringBuffer sb = new StringBuffer(String.valueOf(num));
    // StringBuffer rev = sb.reverse();
    // System.out.println("Reverse number is:" + rev);

    // ------------------------------------------------------------------------

    // 3.Using Stringbuilder method

    StringBuilder sb = new StringBuilder();
    sb.append(num);
    StringBuilder rev = sb.reverse();
    System.out.println("Reverse number is:" + rev);

  }
}
