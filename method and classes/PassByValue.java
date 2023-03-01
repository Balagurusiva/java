public class PassByValue {
    public static void main(String[] args) {
      int x = 5;
      System.out.println("x before method call: " + x); // prints 5
      increment(x);
      System.out.println("x after method call: " + x); // still prints 5
    }
  
    public static void increment(int n) {
      n++;
    }
  }