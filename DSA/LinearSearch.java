public class LinearSearch {
  public static void main(String[] args) {

    int arr[] = { 10, 20, 4, 6, 8, 2 };
    Boolean flag = false;
    Integer element = Integer.parseInt(args[0]);
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == element) {
        flag = true;
        break;
      }
      i++;
    }
    if (flag == true) {
      System.out.println("Element Found");
    } else {
      System.out.println("Element Not Found");
    }
  }
}
