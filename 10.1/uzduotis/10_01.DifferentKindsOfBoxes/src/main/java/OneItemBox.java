import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items = new ArrayList<>();

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (items.isEmpty()) {
            items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item ite : items) {
            if (item.equals(ite)) {
                return true;
            }
        }
        return false;
    }
}
