import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrainConsistManagementAppTest {

    public boolean searchBogie(String[] bogieIds, String searchId) {

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }
        return false;
    }

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};

        assertThrows(IllegalStateException.class, () -> {
            searchBogie(bogies, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101", "BG205"};

        assertDoesNotThrow(() -> {
            searchBogie(bogies, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};

        assertTrue(searchBogie(bogies, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};

        assertFalse(searchBogie(bogies, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};

        assertTrue(searchBogie(bogies, "BG101"));
    }
}