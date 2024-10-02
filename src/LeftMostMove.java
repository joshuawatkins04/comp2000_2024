import java.util.List;

public class LeftMostMove implements MoveStrategy {
    public Cell moveStrategy(List<Cell> possibleLocs) {
        return possibleLocs.get(1);
    }
}
