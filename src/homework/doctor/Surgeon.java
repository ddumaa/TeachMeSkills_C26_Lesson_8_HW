package homework.doctor;

public class Surgeon implements ITreatment {
    @Override
    public void treatment() {
        System.out.print("Performs an operation");
    }
}
