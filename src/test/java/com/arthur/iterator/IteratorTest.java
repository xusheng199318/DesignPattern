package com.arthur.iterator;

import org.junit.Test;

/**
 * Created by Arthur on 2018/2/3.
 */
public class IteratorTest {

    @Test
    public void testIterator() {
        MenuItem menuItem = new MenuItem("cookie", "饼干", true, 10.0);
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItems(menuItem);
        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
