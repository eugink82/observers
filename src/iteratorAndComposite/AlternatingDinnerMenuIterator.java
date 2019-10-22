package iteratorAndComposite;

import iteratorAndComposite.composite.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinnerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position;

    public AlternatingDinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow=Calendar.getInstance();
        position=rightNow.get(Calendar.DAY_OF_WEEK)%2;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position+=2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
}
