public class Employee{
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName,String lastName,double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0){
        this.salary = salary;}
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSalary(double salary){
        if(salary > 0){
        this.salary = salary;}
    }
    public double getSalary(){
        return salary;
    }
    public double increaseSalary(){
        salary = salary * 1.1;
        return salary;
    }
    
}