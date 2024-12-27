package Day4;

import java.util.Date;

public abstract class BaseEmployeeType {
    private int ID;
    private String name;
    private Date dateOfJoining;

    public BaseEmployeeType(int ID, String name, Date dateOfJoining) {
        this.ID = ID;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

}
