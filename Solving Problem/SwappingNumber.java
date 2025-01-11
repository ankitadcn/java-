public class SwappingNumber {

  public static void main(String[] args) {

    int a = 10;
    int b = 20;

    System.out.println("Befor Swapping values..." + a + "  " + b);

    // logic 1: using third variable

    int c = a; // c=10
    a = b; // a=20
    b = c; // b=10

    // ----------------------------------------------------------------------
    // logic 2: use +and- without using third variable

    // a = a + b; // 10+20=30 ,a=30
    // b = a - b; // 30-20=10 ,b=10
    // a = a - b; // 30-10=20 ,a=20 so it is a=20 and b=10

    // -------------------------------------------------------------------------

    // logic 3: use *and / without using third variable
    // here a and b value should not be zero

    // a = a * b; // 10*20=200 , a=200
    // b = a / b; // 200/20=10 , b=10
    // a = a / b; // 200/10=20 , b=20;

    // ---------------------------------------------------------------------------------

    // logic 4: use of Bitwise operator XOR

    // a=a^b; //10^20=30
    // b=a^b; //30^20=10
    // a=a^b; //30^10=20

    System.out.println("After Swapping values..." + a + " " + b);
  }
}
