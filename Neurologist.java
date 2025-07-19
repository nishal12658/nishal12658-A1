public class Neurologist extends HealthProfessional{

    String researchArea;

    public Neurologist() {

    }

    public Neurologist(int ID, String Name, String DoctorType, String researchArea) {

        super(ID, Name, DoctorType);
        this.researchArea = researchArea;

    }

    public void printDetails() {

        super.printDetails();
        System.out.println("Research Area: " + researchArea);

    }
}
