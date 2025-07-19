public class Appointment {

    // Instance variables
    String pName;
    String phoneNum;
    String timeSlot;
    HealthProfessional healthProfessional;

    public Appointment() {

    }

    public Appointment(String pName, String phoneNum, String timeSlot, HealthProfessional doctor) {
        this.pName = pName;
        this.phoneNum = phoneNum;
        this.timeSlot = timeSlot;
        this.healthProfessional = doctor;
    }

    
}