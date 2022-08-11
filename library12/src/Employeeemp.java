public class Employeeemp {
    public static void main(String[] args) {
        Employee danial = new Employee("Danial", 1383, 20, "12/12/1912", "bhadbzgjhx 26752 gshh", 3000);
        
        double annualSalary = danial.annualSalary();
        System.out.println("annualSalary = " + annualSalary);
        System.out.println("mountly raise = " + danial.salary);
        
    }
}
