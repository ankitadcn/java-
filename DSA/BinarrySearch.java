public class BinarrySearch {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70, };
    int searchValue = Integer.parseInt(args[0]);
    int beg = 0;
    int end = arr.length - 1;
    while (beg <= end) {
      int mid = (beg + end) / 2;
      if (searchValue == arr[mid]) {
        System.out.println("Element Found.at[%d] Index", mid);
        return;
      } else if (searchValue > arr[mid]) {
        beg = mid + 1;
      } else if (searchValue < arr[mid]) {
        end = mid - 1;
      }
    }
    System.out.println("Element not found");
  }
}
