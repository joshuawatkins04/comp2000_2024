import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import java.util.stream.Collectors;

public class BotMovingState extends StateCommon {
  public BotMovingState(Stage s) {
    super(s);
    stateName = "BotMoving";
  }

  public void paint(Graphics g, Point mouseLocs) {
    // do we have AI moves to make?
    for(Actor a: stage.actors) {
      if(!a.isHuman()) {
        List<Cell> possibleLocs = getClearRadius(a.loc, a.moves);
        Cell nextLoc = a.strat.chooseNextLoc(possibleLocs);
        a.setLocation(nextLoc);
      }
    }
    stage.currentState = new ChoosingActorState(stage);
    for(Actor a: stage.actors) {
      a.turns = 1;
    }
  }

  public List<Cell> getClearRadius(Cell from, int size) {
    // Task 20
    // final Set<Cell> actorLocs = new HashSet<Cell>(
    //   stage.actors.stream().map(a -> a.loc).collect(Collectors.toSet())
    // );
    // Stream<Cell> init = stage.grid.getRadius(from, size).stream();
    // Stream<Cell> clear = init.filter(cell -> !actorLocs.contains(cell));
    // return clear.collect(Collectors.toList());
    
    // Task 20a
    return
      stage.grid.getRadius(from, size)
        .stream() // Gets grid radius information and puts it into a stream
        .filter(cell -> stage.actors  // Filters this stream but needs to collect actor cell locations in lambda function
          .stream()
          .map(a -> a.loc)  // Maps locations of actors
          .noneMatch(cell::equals)) // Checks if a cell is equal to that actors location. 
        .collect(Collectors.toList());  // Converts this information to a list
  }

  public void mouseClicked(int x, int y) {
    // should never happen
    System.out.println(stage.currentState);
  }
}
