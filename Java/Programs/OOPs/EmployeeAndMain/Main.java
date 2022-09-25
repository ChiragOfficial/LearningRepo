package EmployeeAndMain;
import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    byte numberOfEntries;
    String name;
    int pay;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of enteries: ");
    numberOfEntries = sc.nextByte();
    sc.nextLine();

    Employee[] employees = new Employee[numberOfEntries];

    System.out.println("\n\n/*******************************************/\n\n");

    for(byte i = 0; i<numberOfEntries; i++)
    {
      System.out.print("Enter Name : ");
      name = sc.nextLine();

      do
      {
        System.out.print("Enter Pay  : ");
        pay = sc.nextInt();
        if(pay<=0)
        {
          System.out.println("ERROR: ENTER VALID PAY");
        }
      }
      while(pay <= 0);

      employees[i] = new Employee(name, pay);
      System.out.println("\n");
      sc.nextLine();
    }
    sc.close();
    System.out.println("\n/*******************************************/\n\n");

    System.out.println(employees[0].getEmployeeID());
  }
}
