import java.util.Scanner;

public class TestEmployee {

    public static void main (String [] args) {
    	Employee emp = new Employee("Lim", 5000.00);
    	Employee emp2 = new Employee ("Ken");
    	emp2.setSalary(4600.00);
    	
    	//part c
    	if(emp.getSalary()>emp2.getSalary()){
    		System.out.println(emp.getName() + " " + emp.getSalary());
    	}
    	else{
    		System.out.println(emp2.getName() + " " + emp2.getSalary());
    	}
    	
    	System.out.println("Total : " + emp.getSalary() + " + " + emp2.getSalary() + " = " + (emp.getSalary() + emp2.getSalary()));
    	// Qa. System.out.println("Salary : " + emp.salary);
    	/* Qb. System.out.println("Salary : " + emp.getSalary());
    	System.out.println("Salary : " + emp2.getSalary()); */
    	
    	// Qa&b. emp.raiseSalary(8.0);
    	
    	// Qa. System.out.println("Salary : " + emp.salary);
    	/* Qb. System.out.println("Salary : " + emp.getSalary());
    	System.out.println("Salary : " + emp2.getSalary()); */
    }
    
}