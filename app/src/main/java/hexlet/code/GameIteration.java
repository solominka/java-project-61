package hexlet.code;

public final class GameIteration {
    private final String question;
    private final String correctAnswer;

    public GameIteration(String _question, Object _correctAnswer) {
        this.question = _question;
        this.correctAnswer = _correctAnswer.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
