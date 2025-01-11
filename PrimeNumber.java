import java.util.Scanner;
/* 
class PrimeNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();

    int count = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      System.out.println("No is prime number");
    } else {
      System.out.println("It is not Prime number");
    }

  }
}
  */

class PrimeNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();

    if (isPrime(num)) {
      System.out.println(num + "is a prime number");
    } else {
      System.out.println(num + "is a not prime number");
    }
  }

  public static boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}