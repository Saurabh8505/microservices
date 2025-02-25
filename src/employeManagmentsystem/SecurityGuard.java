package employeManagmentsystem;

class SecurityGuard extends Employee {
    public SecurityGuard(String name) {
        super(name, "Security Guard",25000);
    }

    @Override
    public String performDuties() {
        return getName() + " is ensuring the safety and security of the premises"+ "and his Salary is: "+getSalary();
    }
}
