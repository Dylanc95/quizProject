import java.util.Scanner;

public class QuestionsService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionsService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    int i = 0;
    public void playQuiz() {
        for(Question q : questions) {
            System.out.println("Question #" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());
            Scanner scnr = new Scanner(System.in);
            selection[i] = scnr.nextLine();
            i++;
        }

        for (String s: selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < 5; i++) {
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }

}
