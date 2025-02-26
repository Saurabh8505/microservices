package employeManagmentsystem;

import java.util.ArrayList;
import java.util.List;

class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<String> performDutiesAll() {
        List<String> duties = new ArrayList<>();
        for (Employee employee : employees) {
            duties.add(employee.performDuties());
        }
        return duties;
    }
}
