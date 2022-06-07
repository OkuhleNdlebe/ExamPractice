package za.ac.cput.Domain;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void test(){
        Employee employee = new Employee.Builder().setEmployeeNumber("10299374")
                .setFirstName("Okuhle")
                .setLastName("Ndlebe")
                .build();
        System.out.println(employee);

    }


}