public class ConsoleView {
    public void welcome() {
        // Welcome the user.
        System.out.println("****** Board Checker ******");
        System.out.println();
        System.out.println("Welcome to the board checker!");
        System.out.println("This simple program will check your board files to make sure a robot can successfully traverse them!");
        System.out.println();
        System.out.println("***************************");
        System.out.println();
    }

    public void askForFile() {
        // Ask the user to select a file.
        System.out.println("Please select a board file.");
        System.out.println();
    }

    public void displayResult(boolean isPossible) {
        // Display the result.
        System.out.println();
        System.out.print("Result: ");
        if (isPossible) {
            System.out.println("This board looks good! A robot will be able to traverse the whole thing.");
        } else {
            System.out.println("This board won't work! A robot will NOT be able to traverse the whole thing.");
            System.out.println("Consider making changes to the board and checking back later!");
        }
    }

    public void goodbye() {
        System.out.println();
        System.out.println("Done with everything in that directory.");
        System.out.println();
        System.out.println("Thanks for using the Board Checker! Goodbye!");
    }
}