import java.util.*;

/**
 * Java Generic
 *
 */


public class LinkList<E> implements List<E> {
    private NextStep<E> head;

    @Override
    public boolean add (E data) {
        boolean isAddingToList;
        NextStep<E> node = new NextStep<E>(data);
        node.data = data;
        if (head == null) {
            head = node;
            isAddingToList = true;
        } else {
            //its dead-end!!!!!!!!!!!!!!!!!!!!!!!!!
            // How doing the reference to the next el?
            NextStep<E> startPoint = head;
            while (startPoint.nextElement != null) {
                //Here I'm cheating -_- (but I understand how this working)
                startPoint = startPoint.nextElement;
            }
            startPoint.nextElement = node;
            isAddingToList = true;
        }
        return isAddingToList;
    }

    public void print() {
        NextStep<E> startPoint = head;
        while (startPoint != null) {
            if (startPoint == head) {
                System.out.print("[");
            }
            System.out.print(" " + startPoint.data + " ");
            startPoint = startPoint.nextElement;
        }
        System.out.print("]");
    }

    @Override
    public int size() {
    //This
       // return Integer.MAX_VALUE <= NextStep.getAmountOfElement() ? Integer.MAX_VALUE : NextStep.getAmountOfElement();
    //or this
        if (Integer.MAX_VALUE <= NextStep.getAmountOfElement()){
            return Integer.MAX_VALUE;
        }
        return NextStep.getAmountOfElement();
    }

    @Override
    public boolean isEmpty() {
       // NextStep<E> lst = new NextStep<>(head.data);
        return head == null;

    }

    @Override
    public boolean contains(Object o) {
        String element = String.valueOf(o);
        NextStep<E> startPoint = head;
        boolean isContain = false;
        while (startPoint.nextElement != null) {
            startPoint = startPoint.nextElement;
            if (element == startPoint.data){
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
