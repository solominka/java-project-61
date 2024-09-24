package hexlet.code;

public class GameIterationResult {
    public Object userResponse;
    public Object correctResponse;

    public GameIterationResult(Object userResponse, Object correctResponse) {
        this.userResponse = userResponse;
        this.correctResponse = correctResponse;
    }
}
