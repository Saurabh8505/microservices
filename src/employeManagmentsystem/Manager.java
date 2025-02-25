package employeManagmentsystem;

class Manager extends Employee {
    public Manager(String name) {
        super(name, "Manager",80000);
    }

    @Override
    public String performDuties() {
        return getName() + " is managing the team and coordinating projects"+ "and his Salary is: "+getSalary();
    }
}
