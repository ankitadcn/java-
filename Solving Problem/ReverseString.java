public class ReverseString {
  public static void main(String[] args) {

    // 1. Using(String concatenation ) opertor

    // String str = "ABCD";
    // String rev = " ";
    // int len = str.length();
    // for (int i = len - 1; i >= 0; i--) {
    // rev = rev + str.charAt(i);
    // System.out.println(rev);
    // }
    // --------------------------------------------------------------------

    // 2.Using char array

    // String str = "ABCD";
    // String rev = " ";
    // char a[] = str.toCharArray();
    // int len = a.length;
    // for (int i = len - 1; i >= 0; i--) {
    // rev = rev + a[i];
    // System.out.println(rev);

    // ----------------------------------------------------------------------

    // 3.Using Stringbuffer method

    String str = "ABCD";
    String rev = " ";
    StringBuffer sb = new StringBuffer(str);
    System.out.println(sb.reverse());
  }
}
