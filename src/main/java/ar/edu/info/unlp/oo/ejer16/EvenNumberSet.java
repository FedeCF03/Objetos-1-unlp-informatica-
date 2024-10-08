package ar.edu.info.unlp.oo.ejer16;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer> {
    Set<Integer> set;

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(Integer e) {
        if (e % 2 == 0) {
            set.add(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        return set.containsAll(clctn);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> collec) {

        //collec.stream().filter(e -> e % 2 == 0 && set.add(e));
        //return true;
        set.addAll(collec.stream()..filter(e -> e % 2 == 0));
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        return set.retainAll(clctn);
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        return set.removeAll(clctn);
    }

    @Override
    public void clear() {
        set.clear();
    }
}
