/**
	Java. Level 1. Lesson 5. HomeWork5
	
	@author Artem Valeev
	@version Aug 26, 2018
*/

public class HomeWork5 {
	
	public static void main(String[] args){
				
		Employee[] employee = new Employee[5];
		
		String[] full_names = {"Ivanov Ivan", "Petrov Petr", "Antonov Anton",
		"Borisov Boris", "Olgina Olga"};
		
		String[] positions = {"Engineer", "Developer", "Tester", "Back End", "Front End"};
		
		String[] emails = {"ivivan@mailbox.com", "pepetr@mailbox.com", "ananton@mailbox.com",
		"boboris@mailbox.com",	"ololga@mailbox.com"};
		
		String[] phones = {"892312312", "892312313", "892312314", "892312315", "892312316"};
		
		int[] salarys = {3000, 7000, 4000, 3000, 23000};
		
		int[] ages = {30, 40, 20, 50, 30};
		
		for (int i = 0; i < 5; i++) {
			employee[i] = new Employee(full_names[i], positions[i], emails[i], phones[i], salarys[i], ages[i]);
			if (employee[i].getAge() > 40)
				System.out.println(employee[i].toString());
		}		
		
	}
	
}

class Employee {
	
	private String full_name; 
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age; 
	
	Employee(String full_name, String position, String email, String phone,
			int salary, int age) {
		
		this.full_name = full_name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
	
	public String toString() {
		
		return "\t" + this.full_name + 
			"\n\t\t\t Position: \t" + this.position +
			"\n\t\t\t Email: \t" + this.email +
			"\n\t\t\t Phone: \t" + this.phone +
			"\n\t\t\t Salary: \t" + this.salary +
			"\n\t\t\t Age: \t\t" + this.age + "\n";	
	}
	
	int getAge() {
		
		return this.age;
	}
			
}