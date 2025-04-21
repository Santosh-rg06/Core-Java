package runner;

import com.example.external.ScienceProject;
import com.example.external.SoftwareProject;
import com.example.internal.Project;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project1 = new ScienceProject();
        Project project2 = new SoftwareProject();

        System.out.println("=== Science Project ===");
        project1.name();
        project1.objective();
        project1.toolsUsed();
        project1.duration();
        project1.outcome();

        System.out.println("\n=== Software Project ===");
        project2.name();
        project2.objective();
        project2.toolsUsed();
        project2.duration();
        project2.outcome();
    }
}
