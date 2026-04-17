import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    public boolean binarySearch(String[] bogieIds, String key) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
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
    public void testBinarySearch_EmptyArray() {
        String[] ids = {};
        assertFalse(binarySearch(ids, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] ids = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(binarySearch(ids, "BG205"));
    }
}