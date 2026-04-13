import org.junit.jupiter.api.Test;
 UC13

 UC12
import java.util.*;

UC11
import java.util.regex.Pattern;
import java.util.*;
import java.util.stream.Collectors;

 main
 main
 main
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class TrainConsistManagementAppTest {

 UC12
    static class GoodsBogie {
        String type;
        String cargo;
        int capacity;

 UC13
        GoodsBogie(String type, String cargo, int capacity) {

UC11
    String trainRegex = "TRN-\\d{4}";
    String cargoRegex = "PET-[A-Z]{2}";
 main

        GoodsBogie(String type, String cargo) {
main
            this.type = type;
            this.cargo = cargo;
            this.capacity = capacity;
        }
    }

 
    public List<GoodsBogie> filterUsingLoop(List<GoodsBogie> bogies) {
        List<GoodsBogie> result = new ArrayList<>();
        for (GoodsBogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

  
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
UC13
    void testLargeDatasetProcessing() {
        List<GoodsBogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new GoodsBogie("T", "C", i % 100));
        }

        List<GoodsBogie> result = filterUsingStream(bogies);

        assertNotNull(result);
        assertTrue(result.size() > 0);
        assertTrue(result.stream().allMatch(b -> b.capacity > 60));

 UC12
    void testSafety_EmptyBogieList() {
        List<GoodsBogie> list = new ArrayList<>();
        assertTrue(isSafe(list));

    void testRegex_ExactPatternMatch() {
        assertFalse(isValidTrainId("TRN-1234XYZ"));
        assertFalse(isValidCargoCode("PET-ABCD"));

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );

        int total = calculateTotalCapacity(bogies);

        assertEquals(222, total); 
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 50),
                new Bogie("AC Chair", 40),
                new Bogie("First Class", 30)
        );

        int total = calculateTotalCapacity(bogies);

        assertEquals(120, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Collections.singletonList(
                new Bogie("Sleeper", 72)
        );

        int total = calculateTotalCapacity(bogies);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = calculateTotalCapacity(bogies);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 10),
                new Bogie("AC Chair", 20)
        );

        int total = calculateTotalCapacity(bogies);

        assertEquals(30, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 10),
                new Bogie("AC Chair", 20),
                new Bogie("First Class", 30),
                new Bogie("General", 40)
        );

        int total = calculateTotalCapacity(bogies);

        assertEquals(100, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        List<Bogie> originalCopy = new ArrayList<>(bogies);

        calculateTotalCapacity(bogies);

        assertEquals(originalCopy.size(), bogies.size());
        assertEquals(originalCopy.get(0).capacity, bogies.get(0).capacity);
        assertEquals(originalCopy.get(1).capacity, bogies.get(1).capacity);
 main
 main
 main
    }
}