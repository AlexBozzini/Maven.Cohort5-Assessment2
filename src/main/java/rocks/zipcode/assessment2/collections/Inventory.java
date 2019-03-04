package rocks.zipcode.assessment2.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private List<String > strings;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = null;
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        strings.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        strings.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (strings.contains(item)) {
            return Collections.frequency(strings, item);
        } else {
            return 0;
        }
    }
}
