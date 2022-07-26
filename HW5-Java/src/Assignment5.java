import java.util.*;
import java.util.stream.Collectors;

public class Assignment5
{
	public static void main(String [] args)
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Brandan",22,"Male","CS",2022,60312));
		list.add(new Employee(2,"Fatima",51,"Female","CEO",2000,100000));
		list.add(new Employee(3,"John",48,"Male","Maintenance",2002,83214));
		list.add(new Employee(4,"Kyle",22,"Male","HR",2012,79413));
		list.add(new Employee(5,"Xavier",32,"Male","Maintenance",2019,70314));
		list.add(new Employee(6,"Eric",25,"Male","CS",2022,68214));
		list.add(new Employee(7,"Alaina",30,"Female","HR",2015,55000));
		list.add(new Employee(8,"Cassidy",20,"Female","CS",2020,55932));
		list.add(new Employee(9,"Liz",31,"Female","Maintenance",2006,94234));
		list.add(new Employee(10,"Michael",33,"Male","CS",2009,30954));
		
		Map<Object, Object> years = list.stream().collect(Collectors.toMap(p->p.getName(),p->p.getYearOfJoining()));
		System.out.println(years);
		
		//Problem 1: Getting Male and Female counts
		Map<String, Long> problem1 = list.stream()
				.collect(Collectors.groupingBy(p->p.getGender(), Collectors.counting()));
		System.out.println(problem1);
		
		//Problem 2: Find average age of male and female employees
		Map<String, Double> problem2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(problem2);
		
		//Problem 3: Find highest paid employee
		Employee maxSalary = list.stream().max(Comparator.comparing(p-> p.getSalary())).get();
		System.out.println(maxSalary.getName() + " has the highest salary with $" + maxSalary.getSalary());
		
		
		//Problem 4: All employees who joined after 2015
		Set<String> years2=list.stream()
				.filter(p->p.getYearOfJoining()>2015)
				.map(p->p.getName())
				.collect(Collectors.toSet());
		System.out.println(years2);
		
		//Problem 5: Senior most employee
		Employee senior = list.stream().min(Comparator.comparing(p->p.getYearOfJoining())).get();
		System.out.println(maxSalary.getName() + " joined in " + maxSalary.getYearOfJoining());
		
		//Problem 6: Count number of Employees in each department
		Map<String, Long> Departments = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.counting()));
		Departments.forEach((d,count) -> System.out.println("Department: "+ d + " Count: " + count));
		
		//Problem 7: Number of Males/Females in Maintenance
		Map<String, Long> MaintenanceMF = list.stream().filter(p -> p.getDept().equals("Maintenance"))
				.collect(Collectors.groupingBy(p -> p.getGender(), TreeMap::new, Collectors.counting()));
		MaintenanceMF.forEach((gender,count) -> System.out.println("Gender: " +gender+" Count: "+count));
		
		//Problem 8: Average salary of male/female employees
		Map<String, Double> averageSalaries = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, TreeMap::new, Collectors.averagingInt(Employee::getSalary)));
		averageSalaries.forEach((gender, salary) -> System.out.println("Gender: " + gender + " Average Salary: " + salary));
		
		//Problem 9: Employees where 25<age<=30
		List<Employee> under30 = list.stream().filter(p-> p.getAge() <= 30).collect(Collectors.toList());
		List<Employee> over25 = list.stream().filter(p-> p.getAge() > 25).collect(Collectors.toList());
		System.out.println("Under 30: " + under30.stream().map(Employee::getName).collect(Collectors.toList()));
		System.out.println("Over 25: " + over25.stream().map(Employee::getName).collect(Collectors.toList()));
		
		//Problem 10: Name of Employees in each department
		Map<String, List<Employee>> deptNames = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept));
		deptNames.forEach((dept,names) -> System.out.println(dept + " : " + names.stream().map(Employee::getName).collect(Collectors.toList())));
	}
}
