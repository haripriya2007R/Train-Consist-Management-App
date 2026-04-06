

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

    class UC08FilterPassengerBogieStreamTest {

        static class Bogie {
            String name;
            int capacity;


            Bogie(String name, int capacity) {
                this.name = name;
                this.capacity = capacity;
            }
        }

        private List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
            return bogies.stream()
                    .filter(b -> b.capacity > threshold)
                    .collect(Collectors.toList());
        }

        @Test
        void testFilter_CapacityGreaterThanThreshold() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56),
                    new Bogie("General", 90)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertEquals(2, result.size());
            assertTrue(result.stream().allMatch(b -> b.capacity > 70));
        }

        @Test
        void testFilter_CapacityEqualToThreshold() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 70),
                    new Bogie("AC Chair", 56)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertEquals(0, result.size());
        }

        @Test
        void testFilter_CapacityLessThanThreshold() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("First Class", 36),
                    new Bogie("AC Chair", 56)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_MultipleBogiesMatching() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 72),
                    new Bogie("General", 90),
                    new Bogie("AC Chair", 80)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertEquals(3, result.size());
            assertTrue(result.stream().allMatch(b -> b.capacity > 70));
        }

        @Test
        void testFilter_NoBogiesMatching() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("First Class", 30),
                    new Bogie("AC Chair", 40)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_AllBogiesMatching() {
            List<Bogie> bogies = Arrays.asList(
                    new Bogie("Sleeper", 80),
                    new Bogie("General", 90)
            );

            List<Bogie> result = filterBogies(bogies, 70);

            assertEquals(bogies.size(), result.size());
        }

        @Test
        void testFilter_EmptyBogieList() {
            List<Bogie> bogies = new ArrayList<>();

            List<Bogie> result = filterBogies(bogies, 70);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_OriginalListUnchanged() {
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));

            int originalSize = bogies.size();

            List<Bogie> result = filterBogies(bogies, 60);

            assertEquals(originalSize, bogies.size());
            assertEquals(2, bogies.size());
            assertEquals(1, result.size());
        }
    }
