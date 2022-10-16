// Type casting , to change a type of variable to another one
class main {
  public static void main(String[] args) {
    // Quick casting OR Widenning Casting [ from a smaller type to larger type ]
    // byte -> short -> char -> int -> long -> float -> double
    int a = 9;
    double b = a;

    // Narrowing Casting
    float c = 89.55f;
    int d = (int)c;

    System.out.println("" + a + "\n");
    System.out.println("" + b + "\n");
    System.out.println("" + c + "\n");
    System.out.println("" + d + "\n");
  }
}
