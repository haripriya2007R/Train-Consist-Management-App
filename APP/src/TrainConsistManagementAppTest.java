import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            TrainConsistManagementApp.PassengerBogie bogie =
                    new TrainConsistManagementApp.PassengerBogie("Sleeper", 72);
            assertEquals("Sleeper", bogie.type);
            assertEquals(72, bogie.capacity);
        });
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("AC Chair", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("First Class", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.PassengerBogie("Sleeper", -5)
        );

        assertTrue(exception.getMessage().contains("greater than zero"));
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        TrainConsistManagementApp.PassengerBogie bogie =
                new TrainConsistManagementApp.PassengerBogie("AC Chair", 60);

        assertEquals("AC Chair", bogie.type);
        assertEquals(60, bogie.capacity);
    }
    @Test
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
    }
}