package day3program3;

public class Manager extends Employee{
      String dept;
    public Manager(String name,  double salary, String dept) 
    {
        super(name, salary);
        this.dept = dept;}
   public  String toString()
    {
        return "NAME IS: "+  getName() + "\nSALARY IS: " +getSalary()+ "\nDEPARTMENT IS: " + dept ;
    }
}
