 UC19

UC17
import org.junit.Test;
 main
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

 UC19
    public boolean binarySearch(String[] bogieIds, String key) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {

 UC18

    private boolean linearSearch(String[] bogies, String key) {
        for (String id : bogies) {
            if (id.equals(key)) {
 main
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;


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

public class TrainConsistManagementAppTest {

UC16
    int[] bubbleSort(int[] arr) {
        int[] a = arr.clone();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

 main
    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

 UC17
        Arrays.sort(bogies);

        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};
        assertArrayEquals(expected, bogies);

UC14
    @Test
UC15
    void testCargo_SafeAssignment() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            TrainConsistManagementApp.PassengerBogie bogie =
                    new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);
            assertEquals("Sleeper", bogie.type);
            assertEquals(72, bogie.capacity);
        });

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
main
    }
 main

        bogie.assignCargo("Petroleum");
 main

        assertArrayEquals(expected, bubbleSort(input));
 main
 main
    }

    @Test
    public void testBinarySearch_BogieFound() {
        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(binarySearch(ids, "BG309"));
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(binarySearch(ids, "BG999"));
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(binarySearch(ids, "BG101"));
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(binarySearch(ids, "BG550"));
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] ids = {"BG101"};
        assertTrue(binarySearch(ids, "BG101"));
    }

    @Test
 UC19
    public void testBinarySearch_EmptyArray() {
        String[] ids = {};
        assertFalse(binarySearch(ids, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] ids = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(binarySearch(ids, "BG205"));

UC18
    public void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(linearSearch(bogies, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(linearSearch(bogies, "BG101"));

 UC17
    public void testSort_SingleElementArray() {
        String[] bogies = {"Sleeper"};

        Arrays.sort(bogies);

        String[] expected = {"Sleeper"};
        assertArrayEquals(expected, bogies);

 UC16
    void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        assertArrayEquals(expected, bubbleSort(input));

 UC15
    void testCargo_FinallyBlockExecution() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));

UC14
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            TrainConsistManagementApp.PassengerBogie b1 =
                    new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);
            TrainConsistManagementApp.PassengerBogie b2 =
                    new TrainConsistManagementApp.PassengerBogie("AC Chair", 60);
            TrainConsistManagementApp.PassengerBogie b3 =
                    new TrainConsistManagementApp.PassengerBogie("First Class", 40);

            assertNotNull(b1);
            assertNotNull(b2);
            assertNotNull(b3);
        });

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
 main
main
 main
main
 main
 main
    }
}