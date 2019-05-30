public class EmployeeTest{
    public static void main(String[] args){
        Employee employee1 = new Employee("Jokoje", "Mary", 20000);
        Employee employee2 = new Employee("Kunle", "Olawale", 80000);
       // employee1.setSalary(-20000);

        System.out.printf("%s %s yearly salary is %.1f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
        System.out.printf("%s %s yearly salary is %.1f%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());

        System.out.println(employee1.getFirstName() +" "+  employee1.getLastName() + " increased salary is " + employee1.increaseSalary());
        System.out.println(employee2.getFirstName() + " "+ employee2.getLastName() + " increased salary is " + employee2.increaseSalary());
    }
}