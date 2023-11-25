package homework;

import homework.doctor.ITreatment;
import homework.doctor.Therapist;

import java.util.Scanner;

public class Patient {
    int treatmentPlan;
    String doctor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter treatment number");
        Patient patient = new Patient();
        patient.treatmentPlan = scanner.nextInt();
        ITreatment doctor = Therapist.doctorOrders(patient.treatmentPlan);
        patient.doctor = Therapist.doctor;
        System.out.print("Treatment plan no. "+ patient.treatmentPlan  + ". Appointed Doctor: " + patient.doctor + ". ");
        doctor.treatment();

    }
}