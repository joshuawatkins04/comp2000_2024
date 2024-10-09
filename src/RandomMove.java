
import java.util.List;

public class RandomMove implements MoveStrategy {

    @Override
    public Cell chooseNextLoc(List<Cell> possibleLocs) {
        // int i = (new Random()).nextInt(possibleLocs.size());
        // return possibleLocs.get(i);
        return possibleLocs
                .stream()
                .findAny()
                .orElse(null);
    }

    public String toString() {
        return "random movement";
    }
}
