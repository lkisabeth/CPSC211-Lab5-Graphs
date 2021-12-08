import javax.swing.*;
import java.io.File;

public class MainController {
    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.go();
    }

    protected void go() {
        // This program must read all its input from files.
        // There will be multiple files in the testing directory that the program must read.
        // Each file will be named with the .txt extension.
        // For each file that the program reads, it will decide if the board is possible or not.
        // Allow the user to select a directory using JFileChooser.

        // Welcome the user.
        ConsoleView view = new ConsoleView();
        view.welcome();

        // Ask the user to select a directory.
        view.askForFile();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            String path = dir.getAbsolutePath();

            // Read all the files in the directory.
            File[] files = new File(path).listFiles();
            for (File file : files) {
                if (file.getName().endsWith(".txt")) {
                    // Read the file.
                    BoardModel board = new BoardModel(file);
                    // Check if traversing the board is possible.
                    boolean isPossible = board.isConnected(0);
                    view.displayResult(isPossible);
                }
            }
        } else {
            return;
        }

        // Thank the user.
        view.goodbye();
    }
}