/* there are 5 types of operators in java
 *
 *  Arithmetic operators ( + , -, /, *, %, ++, -- ) [ % - Modulus, ++ -
 *  increment , -- - decrement ]
 *
 *  Assisgnment Operators
 *
 *  = , equals to
 *
 *  += , x += 5, x = x + 5
 *
 *  -= , x -= 5, x = x - 5
 *
 *  *=  x *= 5 , x = x * 5
 *
 *  /=  x /= 5 , x = x / 5   .
 *
 *  %=   x %= 5, x = x % 5
 *
 *  &=     .
 *
 * ^=  power off , x ^= 5 , x = x ^ 5    .
 *
 * >>=     .
 *
 * <<=     .
 *
 * Comparison Operators
 *
 *  == if a number is equal to another number
 *
 *  !=  if a number is not equals to another number
 *
 *  > if a number is greater than another number
 *
 *  < if a number is less than another number

 *  >= if a number is greater than or equals to another number
 *
 * <= if a number is less than or equals to another number
 *
 * Logical Operators
 *
 * && - Logical AND [ true && true ] = true and else
 * every combination is false
 *
 * || - Logical OR [ true || false ] = true and only [ false || false ] = false
 *
 * ! - Logical NOT [ Opposite of AND or only of one input ]
 *
 * Bitwise Operators
 *
 * >> , shift right by 1 bit in binary number add 2 and shift
 *
 * << , shift left by 1 bit
 *
 */

class operator {
  public static void main(String[] args) {
    // Modulus
    float a = 9.00f;
    float b = 10.00f;

    System.out.println(" " + a % b + "\n");
    System.out.println(" " + a / b + "\n");

    // increment and decrement
    int c = 10;

    c++; // c = c + 1;
    c--; // c = c - 1;
    // c = c + 1 - 1

    System.out.println(c); // c = 10
  }
}

/*
 * 10 | 9 | 0
 *    - 0
 *    _____
 *
 *      9
 *
 */
