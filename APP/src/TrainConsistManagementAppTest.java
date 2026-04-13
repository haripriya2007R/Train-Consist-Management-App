import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

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

        assertEquals(222, total); // 72+56+24+70
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

        // Ensures map() correctly extracted 10 and 20
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
    }
}