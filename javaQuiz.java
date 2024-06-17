import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class javaQuiz {
    private static Timer timer;
    private static final int TIMEOUT = 5000; // Time in milliseconds
    private static boolean timeUp;
    private static int correctAnswers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE QUIZ :)");
        System.out.println("YOU HAVE ONLY 5 SECONDS TO ANSWER EACH QUESTION");
        correctAnswers = 0;
        runQuiz(sc);
        sc.close();
    }

    private static void runQuiz(Scanner sc) {
        askQuestion(sc, "Q1. Which sector does Codsoft primarily operate in?",
                new String[]{"HEALTH", "EDUCATION", "SOFTWARE DEVELOPMENT ? "}, 3);

        askQuestion(sc, "Q2. Which of the following is not a feature of Java?",
                new String[]{"Object-oriented","Platform-independent","Supports multiple inheritance"}, 3);

        askQuestion(sc, "Q3. What is the name of team who invented java?",
                new String[]{"SUN TEAM", "GREEN TEAM", "META TEAM"}, 2);

        System.out.println("THE ANSWERS YOU HAVE ANSWERED CORRECTLY ARE "+ correctAnswers );       
        System.out.println("QUIZ HAS ENDED");
    }

    private static void askQuestion(Scanner sc, String question, String[] options, int correctAnswer) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        startTimer();
        int answer = sc.nextInt();
        stopTimer();

        if (!timeUp) {
            if (answer == correctAnswer) {
                System.out.println("YES, YOUR ANSWER IS COORECT:)");
                correctAnswers++;
            } else {
                System.out.println("SORRY YOUR ANSWER IS WRONG :(");
            }
        }
    }

    private static void startTimer() {
        timeUp = false;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                timeUp = true;
                System.out.println("TIME'S UP! MOVING ON  TO THE NEXT QUESTION.");
                System.out.println("PRESS ANY KEY AND CLICK ON ENTER.");
                timer.cancel();
            }
        }, TIMEOUT);
    }

    private static void stopTimer() {
        if (timer != null) {
            timer.cancel();
        }
    }
}