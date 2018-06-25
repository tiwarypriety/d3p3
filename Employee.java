
package day3program3;

public class Employee {
   private String name;
   private double salary;
   Employee(String name,double salary)
   {
       this.name = name;
       this.salary = salary;
   }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
     
}
