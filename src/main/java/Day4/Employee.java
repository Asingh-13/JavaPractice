package Day4;

import java.util.Date;

public class Employee extends BaseEmployeeType{

    private int salary;

    public Employee(int ID, String name, Date dateOfJoining, int salary) {
        super(ID, name, dateOfJoining);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Day4.Employee{" +
                "Name " + super.getName()+
                ", Id "+super.getID()+
                ", Joining Date "+super.getDateOfJoining()+
                ", salary=" + salary +
                '}';
    }
}
