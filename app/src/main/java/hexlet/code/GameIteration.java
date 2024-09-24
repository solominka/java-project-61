package hexlet.code;

public class GameIteration {
    private final String question;
    private final String correctAnswer;

    public GameIteration(String question, Object correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
