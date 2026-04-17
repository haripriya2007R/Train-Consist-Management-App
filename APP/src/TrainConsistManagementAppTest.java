import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    // Helper method for reuse
    private boolean linearSearch(String[] bogies, String key) {
        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testSearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(linearSearch(bogies, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(linearSearch(bogies, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(linearSearch(bogies, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(linearSearch(bogies, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(linearSearch(bogies, "BG101"));
    }
}