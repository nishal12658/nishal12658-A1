
public class AssignmentOne {

    public static void main(String[] args) {

        // Part 3 – Using classes and objects

        //3 General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "John", "General Practissionar", "6 to 9");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Stark", "Neurologist", "7 to 10");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Elon", "General Practissionar", "5 to 11");

        // Printing details using class methods
        gp1.printDetails();
        System.out.println("--------------------------------");
        gp2.printDetails();
        System.out.println("--------------------------------");
        gp3.printDetails();
        System.out.println("--------------------------------");

    }
}