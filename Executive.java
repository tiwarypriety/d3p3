
package day3program3;


public class Executive extends Manager{
     Executive()
     {
      super("ram",1000,"it");
     }
     public  String toString()
     {      
         return "Executive NAME IS: "+  getName() + " \nSALARY IS: "+  getSalary()+ "\nDEPARTMENT IS: " + dept +"";
   
 }
}
