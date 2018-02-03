package com.arthur.iterator;

/**
 * Created by Arthur on 2018/2/3.
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int index = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItems(MenuItem menuItem) {
        this.menuItems[index++] = menuItem;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
