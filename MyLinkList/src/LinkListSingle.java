import java.util.*;

/**
 * Java Generic
 *
 */


public class LinkListSingle<E> implements List<E> {
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
        System.out.print("[");
        while (startPoint != null) {
            System.out.print(" " + startPoint.data + " ");
            startPoint = startPoint.nextElement;
        }
        System.out.print("]");
        System.out.println();
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
    public Object[] toArray() {
        Object[] arr = new Object[NextStep.getAmountOfElement()];
        NextStep<E> lst = head;
        for ( int i = 0; lst != null; i++){
                arr[i] = lst.data;
            lst = lst.nextElement;
        }
        return arr;
    }

    //Working with edge cases
  @Override
    public boolean remove(Object o) throws NullPointerException {
        if (o == null){
            throw new NullPointerException("get a null but we need a reference to object");
        }

        E data = (E)o;

        boolean isRemove = false;

        NextStep<E> currentNode = head;
        NextStep<E> prevNode = head;

      if (data.equals(head.data)){

          head = currentNode.nextElement;
          currentNode.nextElement = null;

          isRemove = true;
          return isRemove;
      }

        while (currentNode != null){

            if (data.equals(currentNode.data)){
                prevNode.nextElement = currentNode.nextElement;

                currentNode.nextElement = null;
                isRemove = true;

                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextElement;
        }
        return isRemove;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int indexOf(Object o) {
        E data = (E)o;
        NextStep<E> currentNode = head;

        for (int i = 0; currentNode != null; i++){

            if (currentNode.data == data){
                return i;
            }
            currentNode = currentNode.nextElement;
        }
        return -1;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        NextStep<E> currentNode = head;
        List<E> lst = new LinkListSingle<>();
        for (int i = 0; currentNode != null; i++){
            if (i == fromIndex || i <= toIndex){
                lst.add(currentNode.data);
            }
            currentNode = currentNode.nextElement;
            if (i == toIndex) {
                break;
            }
        }
        return lst;
    }

    /////////////////////////////////////////////////////////////////
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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
    public Iterator<E> iterator() {
        return null;
    }

}
