public class Demo {

  public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2; // Calculate mid index

      if (arr[mid] == target) {
        return mid;
      }

      if (arr[mid] > target) {
        right = mid - 1;
      }

      else {
        left = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
    int target = 7;

    int result = binarySearch(arr, target);
    if (result == -1) {
      System.out.println("Element not found in the array.");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }
}
