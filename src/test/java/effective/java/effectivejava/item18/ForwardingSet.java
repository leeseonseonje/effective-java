package effective.java.effectivejava.item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> {

    private final Set<E> set;

    public ForwardingSet(Set<E> set) {
        this.set = set;
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean contains(Object o) {
        return set.contains(o);
    }

     
    public Iterator iterator() {
        return set.iterator();
    }

     
    public Object[] toArray() {
        return set.toArray();
    }

     
    public boolean add(E e) {
        return set.add(e);
    }

     
    public boolean remove(Object o) {
        return set.remove(o);
    }

     
    public boolean
    addAll(Collection<? extends E> c) {
        return set.addAll(c);
    }

     
    public void clear() {
        set.clear();
    }

     
    public boolean removeAll(Collection c) {
        return set.removeAll(c);
    }

     
    public boolean retainAll(Collection c) {
        return set.retainAll(c);
    }

     
    public boolean containsAll(Collection c) {
        return set.containsAll(c);
    }

     
    public Object[] toArray(Object[] a) {
        return set.toArray(a);
    }
}
