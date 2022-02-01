package Kjedet;

import adt.FilmarkivADT;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public class Filmarkiv2 implements FilmarkivADT {
    private Node firstNode;
    private int numerOfEntries;

    public Filmarkiv2() {
        firstNode = null;
        numerOfEntries = 0;
    }
    // leggtilFilm metode
    public boolean add(Film film) {
        Node newNode = new Node(film);
        newNode.next = firstNode;
        firstNode = newNode;
        numerOfEntries++;
        return true;
    }

    public Film[] toArray() {
        Film[] result = (Film[])new Object[numerOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numerOfEntries) && (currentNode != null)) {
            result[index] = currentNode.film;
            index++;
            currentNode = currentNode.next;
        }
        return result;
    }
    // antall av samme type film
    public int getFrequencyOf(Film film) {
        int frequency = 0;
        int loopcounter = 0;
        Node currentNode = firstNode;
        while ((loopcounter < numerOfEntries) && (currentNode != null)) {
            if (film.equals(currentNode.film)) {
                frequency++;
            }
            loopcounter++;
            currentNode = currentNode.next;
        }
        return frequency;
    }
    // Metode for å finne sjanger
    public boolean containsGenre(Film film) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (film.getSjanger() == currentNode.film.getSjanger()) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }







    private class Node {
        private Film film;
        private Node next;

        private Node(Film film) {
            this(film, null);
        }

        private Node(Film film, Node nextnode) {
            film = film;
            next = nextnode;
        }
    }


}
