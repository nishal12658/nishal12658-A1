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

    
}