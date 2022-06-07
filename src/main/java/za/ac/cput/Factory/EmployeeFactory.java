package za.ac.cput.Factory;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Util.Helper;

public class EmployeeFactory {

public static Employee Employeecreate ( String firstName, String lastName){

    if (firstName.isEmpty() || lastName.isEmpty()){
        System.out.println(" Please fill in blank");
    }
 String employeeId = Helper.generateId();
 Employee employee = new Employee.Builder().setEmployeeNumber(employeeId)
         .setFirstName(firstName)
         .setLastName(lastName)
         .build();
 return employee;
}
}
