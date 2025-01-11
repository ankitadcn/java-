import java.security.PublicKey;

public class Stack_ArrayList {
  private String arr[];
  private Integer size;

  public Stack_ArrayList(Integer n) {
    arr = new String[n];
    size = 0;
  }

  private Integer top = -1;

  public void push(String data) {
    if (top == arr.length) {
      System.out.println("Stack is full");
    } else {
      top++;
      arr[top] = data;
      System.out.println("Item Inserted");
    }
  }

  void traverse(){
    if (top!=-1) {
      for(int i=top; i>=0;i--){
        System.out.println([i]);
      }
    }
      else{
        System.out.println("No item found due to empty stack");
      }
    }

  public void pop() {
    if (top != -1) {
      System.out.println(arr[top] + "Item Removed");
      top--;
      size--;
    } else {
      System.out.println("No is item Removed due to empty stack");
    }
  }

  void peek() {
    if (top != -1) {
      System.out.println("Last item is:" + arr[top]);
    } else {
      System.out.println("No itrem due to empty");
    }
  }

  public Integer size() {
    return size;
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public void clear() {
    top = -1;
    size = 0;
  }

  public String search(String data) {
    if (top != -1) {
      for (int i = top; i > 0; i--) {
        if (arr[i].equals(data)) {
          return "Item found at[" + i + "]index";
        }
      }
      return "false";
    }
  }

  public String getMax() {
    String max = arr[0];
    for (int i = top; i >= 0; i--) {
      if (arr[i].compareTo(max) > 0)
        max = arr[i];
    }
    return "Max value is:" + max;
  }

  public String getMin() {
    String min = arr[0];
    for (int i = top; i >= 0; i--) {
      if (arr[i].compareTo(min) < 0)
        min = arr[i];
    }
    return "Max value is:" + min;
  }

}

public static void main(String[] args) {
  Stack_ArrayList s = new Stack_ArrayList(5);
  s.push("A");
  s.push("B");
  s.push("C");
  s.push("D");
  s.push("E");
  s.traverse();
  System.out.println(s.getMax());
  System.out.println(s.getMin());
}