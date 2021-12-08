import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class BoardModelTest {
    @Test
    public void testIsConnected() {
        BoardModel board = new BoardModel(new File("test_board.txt"));
        assertTrue(board.isConnected(0));
        assertFalse(board.isConnected(1));
    }
}