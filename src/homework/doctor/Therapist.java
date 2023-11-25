package homework.doctor;

public class Therapist implements ITreatment {
    public static String doctor;
    public static ITreatment doctorOrders(int treatmentPlan){
        if (treatmentPlan == 1) {
            doctor = "Surgeon";
            return new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = "Dentist";
            return new Dentist();
        } else {
            doctor = "Therapist";
            return new Therapist();
        }
    }
    @Override
    public void treatment() {
        System.out.print("Prescribe medicine");
    }

}
