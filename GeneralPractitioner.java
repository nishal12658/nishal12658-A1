public class GeneralPractitioner extends HealthProfessional{

    String clinicHours;

    public GeneralPractitioner() {
        
    }

    public GeneralPractitioner(int ID, String Name, String DoctorType, String clinicHours) {

        super(ID, Name, DoctorType);
        this.clinicHours = clinicHours;
    
    }

    @Override
    public void printDetails() {

        super.printDetails();
        System.out.println("Clinic Hours: " + clinicHours);
    }
}
