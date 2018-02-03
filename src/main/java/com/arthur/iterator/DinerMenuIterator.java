package com.arthur.iterator;

/**
 * Created by Arthur on 2018/2/3.
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;

    private Integer index = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (index < items.length && items[index] != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        return (MenuItem)items[index++];
    }

    public Object remove() {
        throw new UnsupportedOperationException();
    }
}
