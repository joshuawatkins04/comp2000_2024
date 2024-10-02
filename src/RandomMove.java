import java.util.List;
import java.util.Random;

public class RandomMove implements MoveStrategy {
    public Cell moveStrategy(List<Cell> possibleLocs) {
        return possibleLocs.get((new Random()).nextInt(possibleLocs.size()));
    }
}
