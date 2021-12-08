import org.junit.jupiter.api.Test;

public class ConsoleViewTest {
    @Test
    public void testWelcome() {
        ConsoleView view = new ConsoleView();
        view.welcome();
    }

    @Test
    public void testAskForFile() {
        ConsoleView view = new ConsoleView();
        view.askForFile();
    }

    @Test
    public void testDisplayResult() {
        ConsoleView view = new ConsoleView();
        view.displayResult(true);
        view.displayResult(false);
    }

    @Test
    public void testGoodbye() {
        ConsoleView view = new ConsoleView();
        view.goodbye();
    }
}