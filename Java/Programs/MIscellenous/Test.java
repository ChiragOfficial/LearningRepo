//import java.util.*;
/*class Shape
{
  void draw()
  {
    System.out.println("Drawing Shape");
  }
  void erase()
  {
    System.out.println("Erasing Hsape");
  }
}

class Circle extends Shape
{
  void draw()
  {
    System.out.println("Drawing Circle");
  }
  void erase()
  {
    System.out.println("Erasing Circle");
  }
}

class Square extends Shape
{
  void draw()
  {
    System.out.println("Drawing Square");
  }
  void erase()
  {
    System.out.println("Erasing Square");
  }
}


class Triangle extends Shape
{
  void draw()
  {
    System.out.println("Drawing Triangle");
  }
  void erase()
  {
    System.out.println("Erasing Triangle");
  }
}


class Main
{
  public static void main(String[] args)
  {
    Shape cir = new Circle();
    Shape sqr = new Square();
    Shape tri = new Triangle();
    cir.draw();
    cir.erase();
    sqr.draw();
    sqr.erase();
    tri.draw();
    tri.erase();
  }
}
class Main
{
  public static void main(String[] args)
  {
    short numberOfElements;
    int largestNumber;
    int finalize;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    numberOfElements = sc.nextShort();

    int[] array = new int[numberOfElements];
    System.out.println("");

    for(int i = 0; i<numberOfElements; i++)
    {
      int j = i+1;
      System.out.print("Enter the "+j);
      if(j == 1)
      {
        System.out.print("st");
      }
      else if(j == 2)
      {
        System.out.print("nd");
      }
      else if(j == 3)
      {
        System.out.print("rd");
      }
      else
      {
        System.out.print("th");
      }
      System.out.print(" element: ");

      array[i] = sc.nextInt();
      System.out.println("");
      sc.nextLine();
    }

    sc.close();

    largestNumber = array[0];

    for(int i = 0; i<numberOfElements; i++)
    {
      if(largestNumber<array[i])
      {
        largestNumber = array[i];
      }
    }

    finalize = largestNumber - array[numberOfElements-1];
    System.out.println("Largest Number  : "+largestNumber);
    System.out.println("Finalized Number: "+finalize);
  }
}

*/
import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    for(int i = 0; i<str.length(); i++){
      
    }
  }
}