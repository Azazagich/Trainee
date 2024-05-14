public class NextStep<E>  {
    public E data;
    public NextStep<E> nextElement;
    public NextStep<E> prevElement;

    public NextStep(E data){
        this.data = data;
        this.nextElement = null;
        this.prevElement = null;
    }
}
