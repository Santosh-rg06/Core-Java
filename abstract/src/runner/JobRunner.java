package runner;

import com.example.external.TeacherJob;
import com.example.external.EngineerJob;
import com.example.internal.Job;

public class JobRunner {
    public static void main(String[] args) {
        Job job1 = new TeacherJob();
        Job job2 = new EngineerJob();

        System.out.println("=== Teacher Job ===");
        job1.describe();
        job1.responsibilities();
        job1.requiredSkills();
        job1.workingEnvironment();
        job1.careerGrowth();

        System.out.println("\n=== Engineer Job ===");
        job2.describe();
        job2.responsibilities();
        job2.requiredSkills();
        job2.workingEnvironment();
        job2.careerGrowth();
    }
}
