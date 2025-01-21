import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> movables;
    ;

    public Herd() {
        movables = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable movable : movables) {
            movable.move(dx, dy);
        }

    }

    public void addToHerd(Movable movable) {
        movables.add(movable);

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : movables) {
            result.append(movable).append("\n");
        }
        return result.toString();
    }

}
