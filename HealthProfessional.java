public class HealthProfessional {

    int ID;
    String name;
    String doctorType;

    public HealthProfessional() {
    }

    public HealthProfessional(int ID, String Name, String DoctorType) {
        this.ID = ID;
        this.name = Name;
        this.doctorType = DoctorType;
    }

    public void printDetails() {
        System.out.println("The doctor details are:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Type: " + doctorType);
    }
}
