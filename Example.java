
class Example {
   Example() {
      this("a");
      System.out.println("Pixel");
   }

   Example(int a) {
      this();
      System.out.println("Papa");
   }

   Example(String a) {
      System.out.println("Maa");
   }

   public static void main(String[] args) {
      Example test = new Example(100);
   }
}
