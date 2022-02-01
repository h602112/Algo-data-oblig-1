package Kjedet;

public class LinearNode <T> {
    private LinearNode<T> neste;
    private T element;

    /**
     * opretter en tom node
     */
    public LinearNode() {
        neste = null;
        element = null;
    }

    /**
     *Opretter en node med et element
     *
     *
     * @param elem elementet som skal inn i noden
     */
    public LinearNode(T elem) {
        neste = null;
        element = elem;
    }

    /**
     * returnerer etterfølger
     *
     * @return neste node
     */
    public LinearNode<T> getNeste() {
        return neste;
    }

    public void setElement(T elem) {
        element = elem;
    }

}
