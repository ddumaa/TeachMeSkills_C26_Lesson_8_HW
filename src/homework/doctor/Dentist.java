package homework.doctor;

public class Dentist implements ITreatment {
    @Override
    public void treatment() {
        System.out.print("To treat teeth");
    }
}
