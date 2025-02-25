package employeManagmentsystem;

import java.util.List;

public class Test {
	public static void main(String[] args) {
       
        Employee manager = new Manager("Rancho");
        Employee developer = new Developer("Farhan");
        Employee securityGuard = new SecurityGuard("Raju");

       
        EmployeeManagementSystem empSystem = new EmployeeManagementSystem();

       
        empSystem.addEmployee(manager);
        empSystem.addEmployee(developer);
        empSystem.addEmployee(securityGuard);

        
        List<String> duties = empSystem.performDutiesAll();
        for (String duty : duties) {
            System.out.println(duty);
        }
    }

}
