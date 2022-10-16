// Methods are generally that thing's or object's function
//
// and it is used as
//
// variableName.methodName()
//
// String is arrays of character
//
// ['a','o','i']
//
// in Standard programming languages , index start from 0

public class stringsdemo {
  public static void main(String[] args) {
    String a = "Haslenda chehra de koi matlab hi nahi hota";

    // Different methods of String
    System.out.println("the length of a is " + a.length());

    // Casing
    System.out.println(a.toUpperCase());
    System.out.println(a.toLowerCase());

    // finding a character or word in string
    System.out.println(a.indexOf("de")); // 16

    // Concatenating
    String b = "Nikal";
    String c = " Lawde";

    System.out.println(b.concat(c));

    // System.out.println(b + " " + c);

    // 1 + 1 = 2 but '1' + '2' = '12'

    // Special Characters on string
    String txt = "One day , there was a \"gandu\" named Buji"; // \ is a escape
    // character
    System.out.println(txt);

    // \n - new line
    //
    // \r - carriage return
    //
    // \t - tab
    //
    // \b - backspace
    //
    // \f - form feed :TODO Homework
  }
}
