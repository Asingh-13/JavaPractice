package Day_14_02_2025.Encapsulation;

public class Patient {
    // Private variables
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        setAge(age); // Using setter for validation
    }

    // Getter for patientId
    public String getPatientId() {
        return patientId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive.");
        }
    }

    // Getter for medicalHistory
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setter for medicalHistory
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
