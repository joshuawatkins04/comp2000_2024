import java.util.List;

public class LeftMostMove implements MoveStrategy {
  
  // USE STREAM TO CHANGE THIS TO ONE LINE
  @Override
  public Cell chooseNextLoc(List<Cell> possibleLocs) {
    Cell currLM = possibleLocs.get(0);
    for(Cell c: possibleLocs) {
      if(c.leftOfComparison(currLM) < 0) {
        currLM = c;
      }
    }
    return currLM;
  }

  public String toString() {
    return "left-most movement";
  }
}
