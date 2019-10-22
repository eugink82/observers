package iteratorAndComposite;

import java.util.Iterator;

public class DinnerMenuIterator  implements Iterator {
    private MenuItem[] items;
    private int position=0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
