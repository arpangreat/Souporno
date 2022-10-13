/*
 * int - integer numbers, such 1223 341 90 -50
 *
 * float - floating numbers such 123.89 56.90 -90.89 ( imp. 90.00 is also
 * floating )
 *
 * double - int and float combined.
 *
 * boolean - True and False
 *
 * character ( char ) - such 'a' 'b' 'C' '1' - we have to use only single quotes
 * ('') for char.
 *
 * string ( String or str ) - sentence "an apple", "a computer" - we have to use
 * only double quotes
 *
 * 'a' - char
 * "a" - string
 *
 * 'a apple' - is not char
 *
 */

public class variable {
  public static void main(String[] args) {

    // type variableName = value;

    // int
    int a = 10;
    // int u = 10.00; - Error
    System.out.println("the value of a is \n" + a);

    // float
    float b = 10.00f;
    System.out.println("the value of a is \n" + b);

    // double
    double c = 10;
    double d = 10.00;

    System.out.println("the value of a is \n" + c);
    System.out.println("the value of a is \n" + d);

    // boolean
    boolean h = true;

    System.out.println("the value of a is \n" + h);

    // char
    char e = 'e';

    System.out.println("the value of a is \n" + e);

    // string
    String s = "I am a superman";

    System.out.println("the value of a is \n" + s);

    // vaiableName
    // _, $ , %, ^, * is can not be placed in front
    // numbers can be placed
    // in name , only (_)
  }
}
