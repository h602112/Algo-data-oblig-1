package no.hvl.data102;

import adt.FilmarkivADT;

public class FilmArkiv implements FilmarkivADT {
    private Film[] filmer;
    private int plass;
    private int antallFilmer;

    public FilmArkiv(int plass) {
        Film[] filmer = new Film[plass];
        antallFilmer = 0;
    }

    public void visFilm(int nr) {
        if (filmer[nr] == null) {
            System.out.println("Movie does not exist");
        }
        System.out.println(filmer[nr]);
    }

    public void leggTilFilm(Film nyfilm){
        if (antallFilmer == filmer.length) {
            utvid();
        }
        filmer[antallFilmer] = nyfilm;
        antallFilmer++;
    }

    public boolean slettFilm(int filmnr) {
        if (filmer == null) {
            System.out.println("cannot remove movie");
            return false;
        }
        Film[] proxyFilmer = new Film[filmer.length-1];
        for (int i = 0; i < filmer.length; i++) {
            if (proxyFilmer[i].getFilmnr() == filmer[i].getFilmnr()) {
                continue;
            }
            proxyFilmer[i] = filmer[i];
        }
        filmer = proxyFilmer;
        antallFilmer--;
        return true;
    }

    public Film[] soekTittel(String delstreng) {
        Film[] proxyFilmer = new Film[filmer.length];
        int nmrFilmer = 0;
        for (int i = 0; i < filmer.length; i++) {
            if (filmer[i].getTitle().contains(delstreng)) {
                proxyFilmer[i] = filmer[i];
                nmrFilmer++;
            }
        }
        trimTab(proxyFilmer, (nmrFilmer));
        return proxyFilmer;
    }

    public int antall(Sjanger sjanger) {
        int antall = 0;
        for (Film film: filmer) {
            if (film.getSjanger() == sjanger) {
                antall++;
            }
        }
        return antall;
    }

    public int antall() {
        return antallFilmer;
    }

    private void utvid() {
        Film[] utvidetTabell = new Film[filmer.length*2];

        for (int i = 0; i < filmer.length; i++) {
            utvidetTabell[i] = filmer[i];
        }
        filmer = utvidetTabell;
    }

    private Film[] trimTab(Film[] tab, int n) {
        // n er antall elementer
        Film[] nytab = new Film[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
