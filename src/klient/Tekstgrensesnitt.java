package klient;

import adt.FilmarkivADT;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.FilmArkiv;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tekstgrensesnitt {
    // lese opplysningene om en FILM fra tastatur
    public Film lesFilm(){
        // TODO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to input information about the movie:");
        System.out.print("filmnr: ");
        int filmnr = scanner.nextInt();
        System.out.print("Produsent: ");
        String produsent = scanner.next();
        System.out.print("Title: ");
        String title = scanner.next();
        System.out.print("Lansering's år: ");
        int lansering = scanner.nextInt();
        System.out.print("Sjanger (ACTION, DRAMA, HISTORY, SCIFI): ");
        Sjanger sjanger = Sjanger.valueOf(scanner.next().toUpperCase(Locale.ROOT));
        System.out.print("FilmSelskap: ");
        String filmSelskap = scanner.next();

        return new Film(filmnr, produsent, title, lansering, sjanger, null);
    }

    // vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void visFilm(Film film) {
        System.out.println(film);
    }

    // Skrive ut alle Filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
        System.out.println(Arrays.toString(filma.soekTittel(delstreng)));

        // TODO
    }

    // Skriver ut alle Filmer av en produsent / en gruppe
    public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
        System.out.println(Arrays.toString((filma.soekProdusent(delstreng))));
        // TODO
    }

    // Skrive ut en enkel statistikk som inneholder antall Filmer totalt
    // og hvor mange det er i hver sjanger
    public void skrivUtStatistikk(FilmarkivADT filma) {
        // TODO
        int antallFilma = filma.antall();
        int actionAntall = 0;
        int dramaAntall = 0;
        int scifiAntall = 0;
        int historyAntall = 0;
        int index = 0;
        while (index < 4) {
            while (index == 0) {
                actionAntall = filma.antall(Sjanger.ACTION);
            }
            while (index == 1) {
                dramaAntall = filma.antall(Sjanger.DRAMA);
            }
            while (index == 2) {
                scifiAntall = filma.antall(Sjanger.SCIFI);
            }
            while (index == 3) {
                historyAntall = filma.antall(Sjanger.HISTORY);
            }
            index++;
        }
        System.out.println("Antall filmer: " + antallFilma + "\nAntall action filmer: " + actionAntall +
                "\nAntall drama filmer: " + dramaAntall + "\nAmtall scifi filmer: " + scifiAntall +
                "\nAntall history filmer: " + historyAntall);
    }
    // ... Ev. andre metoder
}
