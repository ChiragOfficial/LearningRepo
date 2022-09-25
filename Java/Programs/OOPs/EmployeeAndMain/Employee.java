package EmployeeAndMain;
import java.util.*;


public class Employee
{
  private static short numberOfEmployees = 0;

  //Attributes
  private final String name;
  private final short employeeID=assignID();
  private int salary;

  //Constructor:
  Employee(String name, int salary)
  {

    this.name = Objects.requireNonNullElse(name, "");
    setSalary(salary);
  }
  //Mutators:
  private void setSalary(int salary)    //Private: No one can change the salary
  {
    if(salary<=0)
    {
      System.out.println("ERROR: ENTER VALID SALARY.");
    }
    else
    {
      this.salary = salary;
    }
  }

  //Accessors:
  public String getName()
  {
    return this.name;
  }
  public short getEmployeeID()
  {
    return this.employeeID;
  }
  public int getSalary()
  {
    return this.salary;
  }
  public short getNumberOfEmployees()
  {
    return numberOfEmployees;
  }

  //Facilitators:
  public void raiseSalary(int percentage)
  {
    this.salary += this.salary*percentage/100;
  }
  private static short assignID(){
    short tempID = ++numberOfEmployees;
    return tempID;
  }
}
