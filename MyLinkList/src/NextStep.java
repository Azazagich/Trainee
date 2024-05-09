public class NextStep<E>  {
    public E data;
    public NextStep<E> nextElement;
    private static int AmountOfElement;

    public static int getAmountOfElement() {
        return AmountOfElement;
    }

    public NextStep(E data){
        this.data = data;
        this.nextElement = null;
        AmountOfElement++;
    }
}
