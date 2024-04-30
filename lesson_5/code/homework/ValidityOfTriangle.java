package homework;
//Task 1. Define the three sides of the triangle in the program. Check the validity of the triangle inequality -
// any
// of the sides must be smaller the sum of the other two.
// Report the result - whether a triangle with the given sides exists or not.


public class ValidityOfTriangle {
   public static boolean isTriangle(int side1, int side2, int side3) {
      return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
   }

   public static void main(String[] args) {
      int side1 = 3;
      int side2 = 4;
      int side3 = 5;

      if(isTriangle(side1, side2, side3)) {
         System.out.println("Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " exists.");
      } else {
         System.out.println("Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " does not exist.");
      }
   }
}
