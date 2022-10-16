public class mathdemo {
  public static void main(String[] args) {
    // Math is standard class in java
    // which stores different methods of mathematics

    System.out.println(Math.max(5, 10)); // returns the max value

    System.out.println(Math.min(5, 10)); // returns the min value

    System.out.println(Math.sqrt(144)); // square root of any number // by
    // default float

    System.out.println(Math.abs(-4.7)); // absoulute positive value of any
    // number

    System.out.println(Math.random()); // returns a random number inclusive 0.0
    // to 1.0
    //
    int randi =
        (int)(Math.random() * 101); // 0 to 100 [ 0 to 99 , multiply by 100 ]

    System.out.println(randi);
  }
}
