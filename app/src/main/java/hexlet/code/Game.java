package hexlet.code;

import hexlet.code.model.GameIteration;

public interface Game {
    String getInstruction();
    GameIteration getIteration();
}
