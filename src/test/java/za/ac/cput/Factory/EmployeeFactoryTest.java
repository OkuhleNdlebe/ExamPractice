package za.ac.cput.Factory;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Domain.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    //Test if the user did put every attributes
    @Test
     public void test(){
         Employee employee = EmployeeFactory.Employeecreate("Okuhle ", "Ndlebe");
                 assertNotNull(employee);
         System.out.println(employee);
     }

     //Test if the user did put first name
     @Test
    public void createFirstName(){
        Employee employee = EmployeeFactory.Employeecreate("Okuhle", "Ndlebe");
         System.out.println("Test sucessful");
         assertEquals("Okuhle",employee.getFirstName());
         System.out.println(employee);
     }
     // Test Employee Number
     @Test
    public void createEmployeeNumber(){
        Employee employee = EmployeeFactory.Employeecreate("Okuhle", "Ndlebe");
         System.out.println("Employee Number is created");
         assertNotNull(employee.getEmployeeNumber());
         System.out.println(employee);
     }
    @Test
    public void createLastName(){
        Employee employee = EmployeeFactory.Employeecreate("Okuhle", "Ndlebe");
        assertEquals("Ndlebe", employee.getLastName());
        System.out.println(employee);
    }


}