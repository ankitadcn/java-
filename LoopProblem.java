// 1.WAP tp sum of n natural number
/*
 * public class LoopProblem {
 * public static void main(String[] args) {
 * int sum = 0;
 * int n = 10; // n= natural number
 * for (int i = 1; i <= n; i++) {
 * sum = sum + i; // sum of n number (1+2+3+4+5+6+7+8+9+10)
 * }
 * System.out.println(sum);
 * }
 * }
 */

// 2nd method
/*
 * import java.util.Scanner;
 * 
 * public class Example {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number");
 * int n = sc.nextInt();
 * int sum = 0;
 * // int n = 10; // n= natural number
 * for (int i = 1; i <= n; i++) {
 * sum = sum + i; // sum of n number (1+2+3+4+5+6+7+8+9+10)
 * }
 * System.out.println(sum);
 * }
 * }
 */
// --------------------------------------------------------------------------

// 2. WAP To print sum of even number and odd number in specfic number
/*
 * import java.util.Scanner;
 * 
 * public class LoopProblem {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number");
 * int n = sc.nextInt();
 * 
 * int even = 0;
 * int odd = 0;
 * 
 * for (int i = 1; i <= n; i++) {
 * if (i % 2 == 0) {
 * even = even + i;
 * 
 * } else {
 * odd = odd + i;
 * }
 * }
 * System.out.println("Sum of even no " + even);
 * System.out.println("sum of odd no" + odd);
 * }
 * }
 */

// ---------------------------------------------------------------------

// 3.WAP to print factorial of any given number
/*
 * import java.util.Scanner;
 * 
 * public class LoopProblem {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter tne number:");
 * int num = sc.nextInt();
 * int factorial = 1;
 * for (int i = 1; i <= num; i++) {
 * factorial *= i;
 * }
 * System.out.println("factorial of" + num + ":" + factorial);
 * }
 * 
 * }
 */

// -----------------------------------------------------------------------

// 4.WAP to count even and odd digit in a number in specfic range
/*
 * import java.util.Scanner;
 * 
 * public class LoopProblem {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter a number");
 * int n = sc.nextInt();
 * 
 * int even = 0;
 * int odd = 0;
 * int count = 0;
 * 
 * for (int i = 1;; i++) {
 * if (i % 2 == 0) {
 * even = even + i;
 * count++;
 * } else {
 * odd = odd + i;
 * }
 * if (count == n)
 * break;
 * }
 * System.out.println("Sum of even no " + even);
 * System.out.println("sum of odd no" + odd);
 * }
 * }
 */

// ----------------------------------------------------------------------------
// 5.WAP tp check wheater a number is prime or not
/*
 * import java.util.Scanner;
 * 
 * public class LoopProblem {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("enter the number");
 * int n = sc.nextInt();
 * 
 * int count = 0;
 * for (int i = 1; i <= n; i++) {
 * if (n % i == 0) {
 * count++;
 * }
 * }
 * if (count == 2)
 * System.out.println("Prime Number");
 * else
 * System.out.println(" Not Prime Number");
 * 
 * }
 * 
 * }
 */

// ----------------------------------------------------------------------------------

// 6. WAP to check a weather a number is perfect or not

import java.util.Scanner;

public class LoopProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % 1 == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println(num + "is a perfect number");
    } else {
      System.out.println(num + "is a not perfect number");
    }
  }

}