public class CommitCafe {

    private static String barista = "Nick"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String baristaTitle= "head barista";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups ++;
        System.out.println("Brewed " + drink);
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("Total cups brewed so far: " + cups);


    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " (" + baristaTitle + ")" + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}