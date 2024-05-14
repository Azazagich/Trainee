import java.util.*;

public class LinkListDoubly<E> implements List<E> {

    private NextStep<E> head;
    private NextStep<E> tail;
    private int size = 0;

    @Override
    public boolean add (E data) {
        if (data == null){
            throw new NullPointerException("get a null but we need a reference to object");
        }

        NextStep<E> currentNode = new NextStep<>(data);

        if (this.head == null) {
            this.head = currentNode;
            this.tail = currentNode;
        } else {
            //
            NextStep<E> currentTail = this.tail;
            this.tail = currentNode;
            this.tail.prevElement = currentTail;
        }

        this.size++;

        return true;
    }


    /**
     * ToDo
     * @param index the index of the element to be removed
     * @return
     */

    @Override
    public E remove(int index) throws IllegalArgumentException{
        if (index > this.size || index < 0){
            throw new IllegalArgumentException();
        }

        if (index <= this.size() / 2){
            NextStep<E> currentNode = head;
            NextStep<E> prevNode = head;
            int count = 0;

            if (index == 1){
                head = currentNode.nextElement;
                currentNode.nextElement = null;
            }

            while(count != index){
                count++;

                if (count == index){
                    prevNode.nextElement = currentNode.nextElement;
                    currentNode.nextElement = null;

                    break;
                }

                prevNode = currentNode;
                currentNode = currentNode.nextElement;
            }
//////////////////////////////
        } else if(Objects.nonNull(this.tail)){
           int count = this.size;
            NextStep<E> currentNode = tail;
            while (count >= 0){
                if (count == index){
                    if(Objects.nonNull(currentNode.prevElement)) {
                        currentNode.prevElement.nextElement = currentNode.nextElement;
                    }
                    if(Objects.nonNull(currentNode.nextElement)) {
                        currentNode.nextElement.prevElement = currentNode.prevElement;
                    }
                    break;
                }

                currentNode = currentNode.prevElement;
                count--;
            }
        }
        return null;
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
        return this.size;
    }

    @Override
    public boolean isEmpty() {
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
        Object[] arr = new Object[size];
        NextStep<E> lst = head;
        for ( int i = 0; lst != null; i++){
            arr[i] = lst.data;
            lst = lst.nextElement;
        }
        return arr;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
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


    @Override
    public boolean remove(Object o) {
        if (o == null){
            throw new NullPointerException("get a null but we need a reference to object");
        }
        if (this.contains(o)){
            throw new NumberFormatException();
        }

        E data = (E)o;

        NextStep<E> currentNode = head;
        NextStep<E> prevNode = head;

        if (data.equals(head.data)){

            head = currentNode.nextElement;
            currentNode.nextElement = null;
        }

        while (currentNode != null){

            if (data.equals(currentNode.data)){
                prevNode.nextElement = currentNode.nextElement;

                currentNode.nextElement = null;

                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextElement;
        }
        size--;
        return true;
    }


    @Override
    public String toString() {
        return "LinkListDoubly{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkListDoubly<?> that = (LinkListDoubly<?>) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }

    @Override
    public Iterator<E> iterator() {
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

}




