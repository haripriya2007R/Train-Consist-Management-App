import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class TrainConsistManagementAppTest {

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

    // Loop-based filtering
    public List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {
        List<GoodsBogie> result = new ArrayList<>();
        for (GoodsBogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public List<GoodsBogie> filterUsingStream(List<GoodsBogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();
    }

    @Test
    void testLoopFilteringLogic() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("A", "Coal", 50),
                new GoodsBogie("B", "Grain", 70),
                new GoodsBogie("C", "Oil", 80)
        );

        List<GoodsBogie> result = filterUsingLoop(bogies);

        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testStreamFilteringLogic() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("A", "Coal", 40),
                new GoodsBogie("B", "Grain", 65),
                new GoodsBogie("C", "Oil", 90)
        );

        List<GoodsBogie> result = filterUsingStream(bogies);

        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("A", "Coal", 30),
                new GoodsBogie("B", "Grain", 70),
                new GoodsBogie("C", "Oil", 85)
        );

        List<GoodsBogie> loopResult = filterUsingLoop(bogies);
        List<GoodsBogie> streamResult = filterUsingStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<GoodsBogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new GoodsBogie("T", "C", i));
        }

        long start = System.nanoTime();
        filterUsingLoop(bogies);
        long end = System.nanoTime();

        long elapsed = end - start;

        assertTrue(elapsed > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<GoodsBogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie("T", "C", i % 100));
        }

        List<GoodsBogie> result = filterUsingStream(bogies);

        assertNotNull(result);
        assertTrue(result.size() > 0);
        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }
}