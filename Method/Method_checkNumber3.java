//Method with Parameter and With return type
public class Method_checkNumber3 {
  static String checkNumber(int num) {
    String res = " ";
    if (num % 2 == 0) {
      res = ("No is Even");
    } else {
      res = ("No is odd");
    }
    return res;
  }

  public static void main(String[] args) {
    String c = checkNumber(10);
    System.out.println(c);
    System.out.println(checkNumber(11));
  }
}
