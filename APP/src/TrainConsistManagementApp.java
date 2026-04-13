import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class GoodsBogie {
        String type;
        String cargo;
        int capacity;

        GoodsBogie(String type, String cargo, int capacity) {
            this.type = type;
            this.cargo = cargo;
            this.capacity = capacity;
        }
    }

    public static List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {
        List<GoodsBogie> result = new ArrayList<>();
        for (GoodsBogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    public static List<GoodsBogie> filterUsingStream(List<GoodsBogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==========================================");

        List<GoodsBogie> bogies = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie("Type", "Cargo", random.nextInt(100)));
        }

        long startLoop = System.nanoTime();
        filterUsingLoop(bogies);
        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();
        filterUsingStream(bogies);
        long endStream = System.nanoTime();

        System.out.println();
        System.out.println("Loop Execution Time (ns): " + (endLoop - startLoop));
        System.out.println("Stream Execution Time (ns): " + (endStream - startStream));
        System.out.println();
        System.out.println("UC13 performance benchmarking completed...");
    }
}