package hexlet.code;

public class GameIteration {
    public String question;
    public String correctAnswer;

    public GameIteration(String question, Object correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer.toString();
    }
}
