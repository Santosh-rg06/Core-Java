package runner;


import com.example.external.ArtDream;
import com.example.external.WealthDream;
import com.example.internal.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream dream1 = new WealthDream();
        Dream dream2 = new ArtDream();

        System.out.println("=== Wealth Dream ===");
        dream1.describe();
        dream1.visualize();
        dream1.pursue();
        dream1.achieve();
        dream1.reflect();

        System.out.println("\n=== Art Dream ===");
        dream2.describe();
        dream2.visualize();
        dream2.pursue();
        dream2.achieve();
        dream2.reflect();
    }
}

