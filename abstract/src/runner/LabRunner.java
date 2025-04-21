package runner;

import com.example.external.ChemistryLab;
import com.example.external.ComputerLab;
import com.example.internal.Lab;

public class LabRunner {
    public static void main(String[] args) {
        Lab lab1 = new ChemistryLab();
        Lab lab2 = new ComputerLab();

        System.out.println("=== Chemistry Lab ===");
        lab1.labName();
        lab1.equipment();
        lab1.purpose();
        lab1.safetyMeasures();
        lab1.experimentsConducted();

        System.out.println("\n=== Computer Lab ===");
        lab2.labName();
        lab2.equipment();
        lab2.purpose();
        lab2.safetyMeasures();
        lab2.experimentsConducted();
    }
}
