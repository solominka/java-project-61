package hexlet.code.model;

public final class GameIteration {
    private final String question;
    private final String correctAnswer;

    public GameIteration(String newQuestion, Object newCorrectAnswer) {
        this.question = newQuestion;
        this.correctAnswer = newCorrectAnswer.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
