import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

        Arrays.sort(bogies);

        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};
        assertArrayEquals(expected, bogies);
    }

    @Test
    public void testSort_UnsortedInput() {
        String[] bogies = {"Luxury","General","Sleeper","AC Chair"};

        Arrays.sort(bogies);

        String[] expected = {"AC Chair","General","Luxury","Sleeper"};
        assertArrayEquals(expected, bogies);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        String[] bogies = {"AC Chair","First Class","General"};

        Arrays.sort(bogies);

        String[] expected = {"AC Chair","First Class","General"};
        assertArrayEquals(expected, bogies);
    }

    @Test
    public void testSort_DuplicateBogieNames() {
        String[] bogies = {"Sleeper","AC Chair","Sleeper","General"};

        Arrays.sort(bogies);

        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};
        assertArrayEquals(expected, bogies);
    }

    @Test
    public void testSort_SingleElementArray() {
        String[] bogies = {"Sleeper"};

        Arrays.sort(bogies);

        String[] expected = {"Sleeper"};
        assertArrayEquals(expected, bogies);
    }
}