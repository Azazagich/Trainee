import java.util.*;

public class LinkListDoubly<E> extends LinkListSingle<E> /*implements List<E>*/ {

    protected NextStep<E> tail;
    @Override
    public boolean add (E data) {
        if (data == null){
            throw new NullPointerException("get a null but we need a reference to object");
        }

        NextStep<E> currentNode = new NextStep<>(data);
        currentNode.data = data;

        if (head == null) {
            head = currentNode;
            tail = currentNode;
        } else {
            tail.nextElement = currentNode;
            tail = currentNode;
        }

        return true;
    }
    

    /////////////////////////////////////////////////////////////////
}
