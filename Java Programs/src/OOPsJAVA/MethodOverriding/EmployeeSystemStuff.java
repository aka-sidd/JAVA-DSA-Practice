package OOPsJAVA.MethodOverriding;
import java.util.*;
class Employee {
    void CalculateSalary(){
        System.out.println("Basic Salary Calculated!!");
    }
}
class Manager extends Employee {
    @Override
    void CalculateSalary(){
        System.out.println("Basic Salary + Bonus + Allowence");
    }
}
class Intern extends Employee {
    @Override
    void CalculateSalary(){
        System.out.println("Stipend Only!!");
    }
}
public class EmployeeSystemStuff {
    public static void main(String[] args) {
        Employee[]employee = new Employee[3];
        employee[0] = new Employee();
        employee[1] = new Manager();
        employee[2] = new Intern();

        for(Employee e:employee){
            e.CalculateSalary();
        }
    }

}
