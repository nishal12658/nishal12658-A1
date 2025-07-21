import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        //3 General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "John", "General Practissionar", "6 to 9");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Stark", "Neurologist", "7 to 10");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Elon", "General Practissionar", "5 to 11");

        // Creating 2 Neurologist objects
        Neurologist neuro1 = new Neurologist(104, "Abraham", "Neurologist", "Brain");
        Neurologist neuro2 = new Neurologist(105, "Joseph", "Dermatologist", "Skin");

        // Printing details using class methods
        gp1.printDetails();
        System.out.println("--------------------------------");
        gp2.printDetails();
        System.out.println("--------------------------------");
        gp3.printDetails();
        System.out.println("--------------------------------");

        neuro1.printDetails();
        System.out.println("--------------------------------");
        neuro2.printDetails();
        System.out.println("--------------------------------");


        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Creating 2 GP appointments
        createAppointment(appointments,"Charlotte", "07 3803 6136", "10:00", gp1);
        createAppointment(appointments,"Isla", "07 3803 7645", "11:30", gp2);

        // Creating 2 Neurologist appointments
        createAppointment(appointments,"Amelia", "07 8765 9087", "14:00", neuro1);
        createAppointment(appointments,"Olivia", "07 3424 6758", "15:30", neuro2);
        
    }

    public static void createAppointment(ArrayList<Appointment> appointments,String pName, String phoneNum, String timeSlot, HealthProfessional healthProfessional) {

        if (pName == null || phoneNum == null || timeSlot == null || healthProfessional == null ||
                pName.isEmpty() || phoneNum.isEmpty() || timeSlot.isEmpty()) {

            System.out.println("Appointment not created. Missing required information.");
            return;
        }

        Appointment newAppointment = new Appointment(pName, phoneNum, timeSlot, healthProfessional);
        appointments.add(newAppointment);
        System.out.println("Appointment successfully created for " + pName);
    }

    //Method to print existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {

            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("Existing Appointments:");

        for (int i = 0; i < appointments.size(); i++) {
            Appointment app = appointments.get(i);
            System.out.println("--------------------------------");
            app.printAppointmentDetails();
        }
        System.out.println("--------------------------------");
    }
    
    //Method to cancel a booking by mobile number
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {
            Appointment app = appointments.get(i);
            if (app.phoneNum.equals(mobilePhone)) {
                appointments.remove(i);  // remove by index
                System.out.println("Appointment with mobile " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found with mobile: " + mobilePhone);
        }
    }
}