package employeManagmentsystem;

class Developer extends Employee {
    public Developer(String name) {
        super(name, "Developer",50000);
    }

    @Override
    public String performDuties() {
        return getName() + " is writing code and fixing bugs"+ "and his Salary is: "+getSalary();
    }
}
