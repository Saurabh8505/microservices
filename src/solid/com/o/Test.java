package solid.com.o;

public class Test {
	 public static void main(String[] args) {
	        Employee fullTime = new FullTimeEmployee("Alice", 50000);
	        Employee partTime = new PartTimeEmployee("Bob", 500, 80); // 500 per hour, 80 hours

	        SalaryCalculator.printSalary(fullTime);
	        SalaryCalculator.printSalary(partTime);
	    }
}
