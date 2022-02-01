package klient;

import adt.FilmarkivADT;
import no.hvl.data102.FilmArkiv;

public class KlientFilmarkiv {
    public static void main(String[] args) {
        FilmarkivADT filma = new FilmArkiv(100);
        Meny meny = new Meny(filma);
        meny.start();
    }
}
