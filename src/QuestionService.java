/**
 *  Class representing the questions to ask in the quiz
 */
public class QuestionService {
    // create an array that holds Question references in the heap, not the actual objects Question
    // questions reference variable lives on the stack.
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Capital of the USA", "New York", "Miami", "Denver", "Washington", "Washington");
        questions[1] = new Question(2, "Year that Republic of China was founded", "1932", "1947", "1912", "1933", "1912");
        questions[2] = new Question(3, "Number of continents", "5", "6", "7", "8", "7");
        questions[3] = new Question(4, "Number of world flags", "200", "195", "192", "199", "192");
        questions[4] = new Question(5, "Largest country in the world", "China", "Canada", "Russia", "USA", "Russia");
    }

    public void displayQuestions() {
        for (Question q : questions)
            System.out.println(q);
    }
}
