import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String[] options = new String[4];
    private String answer;

    public Question() {
        question = "No question";
        Arrays.fill(options, "No option");
        answer = "No answer";
    }

    public Question(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        for (int idx = 0; idx < options.length; idx++)
            this.options[idx] = options[idx];
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", answer='" + answer + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
