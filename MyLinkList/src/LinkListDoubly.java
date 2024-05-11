import java.util.*;

public class LinkListDoubly<E> extends LinkListSingle<E> /*implements List<E>*/ {

    private NextStep<E> head;
    private NextStep<E> tail;

    @Override
    public boolean add (E data) {
        boolean isAddingToList = false;
        NextStep<E> currentNode = new NextStep<>(data);
        NextStep<E> lastPoint = currentNode;
        NextStep<E> startPoint = head;
        while (startPoint != null){
            startPoint = startPoint.nextElement;

        }


        while (currentNode.nextElement != null){
            currentNode = currentNode.nextElement;
        }
        currentNode.nextElement = currentNode;
        isAddingToList = true;

        return true;
    }

    /////////////////////////////////////////////////////////////////
}
