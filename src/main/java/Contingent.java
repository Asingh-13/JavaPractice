import java.util.Date;

public class Contingent extends BaseEmployeeType{

    private int payRate;
    private int hoursWorked;

    public Contingent(int ID, String name, Date dateOfJoining, int payRate, int hoursWorked) {
        super(ID, name, dateOfJoining);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Contingent{" +
                "Name " + super.getName()+
                ", Id "+super.getID()+
                ", Joining Date "+super.getDateOfJoining()+
                ", salary=" + payRate * hoursWorked*20 +
                '}';
    }
}
