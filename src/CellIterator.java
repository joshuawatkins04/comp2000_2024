import java.util.Iterator;
import java.util.NoSuchElementException;

public class CellIterator implements Iterator<Cell> {

    Cell[][] cells;
    int ptr1 = 0;
    int ptr2 = 0;

    CellIterator(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean hasNext() {
        return ptr1 < cells.length && ptr2 < cells.length;
    }

    @Override
    public Cell next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        Cell c = cells[ptr1][ptr2];
        ptr1++;
        ptr2++;
        return c;
    }
    
}
