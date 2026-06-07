import java.util.Scanner;

public class OnlineExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        // Login
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials!");
            sc.close();
            return;
        }

        System.out.println("\nLogin Successful!");
        System.out.println("Exam Started...\n");

        long startTime = System.currentTimeMillis();

        int score = 0;

        // Question 1
        System.out.println("1. Which language is used for Android Development?");
        System.out.println("A. Java");
        System.out.println("B. Python");
        System.out.println("C. C");
        System.out.println("D. HTML");
        if (sc.next().equalsIgnoreCase("A")) score++;

        // Question 2
        System.out.println("\n2. Java is a:");
        System.out.println("A. Database");
        System.out.println("B. Programming Language");
        System.out.println("C. Browser");
        System.out.println("D. Operating System");
        if (sc.next().equalsIgnoreCase("B")) score++;

        // Question 3
        System.out.println("\n3. Which company developed Java?");
        System.out.println("A. Google");
        System.out.println("B. Microsoft");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Apple");
        if (sc.next().equalsIgnoreCase("C")) score++;

        // Question 4
        System.out.println("\n4. Which keyword is used to create an object?");
        System.out.println("A. create");
        System.out.println("B. object");
        System.out.println("C. new");
        System.out.println("D. class");
        if (sc.next().equalsIgnoreCase("C")) score++;

        // Question 5
        System.out.println("\n5. Which of the following is not a Java feature?");
        System.out.println("A. Platform Independent");
        System.out.println("B. Object Oriented");
        System.out.println("C. Pointer Support");
        System.out.println("D. Secure");
        if (sc.next().equalsIgnoreCase("C")) score++;

        long endTime = System.currentTimeMillis();

        double percentage = (score / 5.0) * 100;
        double timeTaken = (endTime - startTime) / 1000.0;

        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/5");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

        System.out.println("Time Taken: " + timeTaken + " seconds");
        System.out.println("\nLogged Out Successfully!");

        sc.close();
    }
}