package com.arthur.iterator;

/**
 * Created by Arthur on 2018/2/3.
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    Object remove();
}
