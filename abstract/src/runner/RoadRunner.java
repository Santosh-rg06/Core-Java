package runner;

import com.example.external.CityRoad;
import com.example.external.HighwayRoad;
import com.example.internal.Road;

public class RoadRunner {
    public static void main(String[] args) {
        Road road1 = new CityRoad();
        Road road2 = new HighwayRoad();

        System.out.println("=== City Road ===");
        road1.define();
        road1.materialUsed();
        road1.purpose();
        road1.trafficType();
        road1.maintenance();

        System.out.println("\n=== Highway Road ===");
        road2.define();
        road2.materialUsed();
        road2.purpose();
        road2.trafficType();
        road2.maintenance();
    }
}
