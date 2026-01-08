package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E> extends ArrayList<E> {
    
    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false;
    }

    public void sort() {
        if (this.isEmpty()) return;
        
        Object first = this.get(0);
        if (first instanceof String || first instanceof Number || first instanceof Comparable) {
             Collections.sort((ArrayList<Comparable>) this);
        }
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }
}
