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

    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + pName);
        System.out.println("Mobile Phone: " + phoneNum);
        System.out.println("Preferred Time Slot: " + timeSlot);

        if (healthProfessional != null) {
            System.out.println("Doctor Assigned:");
            healthProfessional.printDetails();
        } else {
            System.out.println("Doctor Assigned: Not yet assigned.");
        }
    }
}