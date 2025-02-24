package co.wipro.java.microservices.solid;
//this interface will increase modularity
interface calculateSal{
	//this method will save the information to the database
    double calculateSalary(Employee employee);
}

public class EmployeeInvoice implements calculateSal {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getSalary() - (employee.getSalary() * 0.5);
    }
}

