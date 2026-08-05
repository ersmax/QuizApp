import java.util.Scanner;

/**
 *  Class representing the questions to ask in the quiz
 */
public class QuestionService {
    // create an array that holds Question references in the heap, not the actual objects Question
    // questions reference variable lives on the stack.
    private Question[] questions = new Question[5];
    private String[] answers = new String[5];

    public QuestionService() {
        String[] q0 =  {"New York", "Miami", "Denver", "Washington"};
        String[] q1 =  {"1932", "1947", "1912", "1933"};
        String[] q2 =  {"5", "6", "7", "8"};
        String[] q3 =  {"200", "195", "192", "199"};
        String[] q4 =  {"China", "Canada", "Russia", "USA"};
        questions[0] = new Question(1, "Capital of the USA", q0, "Washington");
        questions[1] = new Question(2, "Year that Republic of China was founded", q1, "1912");
        questions[2] = new Question(3, "Number of continents", q2, "7");
        questions[3] = new Question(4, "Number of world flags", q3, "192");
        questions[4] = new Question(5, "Largest country in the world", q4, "Russia");
    }

    public void playQuiz() {

        int idxQuestion = 0;
        for (Question q : questions) {
            System.out.println(q.getId() + ") " + q.getQuestion());
            for (String option : q.getOptions())
                System.out.println(option);
            System.out.println("Enter answer below below: ");
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            answers[idxQuestion++] = sc.nextLine();
        }

        for (String answer : answers)
            System.out.println(answer);
    }

    public void printScore() {
        int score = 0;
        for(int idx = 0; idx < questions.length; idx++) {
            Question question = questions[idx];
            String correctAnswer = question.getAnswer();
            String userAnswer = answers[idx];
            if (userAnswer.equalsIgnoreCase(correctAnswer))
                score++;
        }
        System.out.println("Your score is: " + score);
    }
}
