package klient;

import adt.FilmarkivADT;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.FilmArkiv;

import java.util.Locale;
import java.util.Scanner;

public class Tekstgrensesnitt {
    // lese opplysningene om en FILM fra tastatur
    public Film lesFilm(){
        // TODO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to input information about the movie:");
        System.out.println("filmnr: ");
        int filmnr = scanner.nextInt();
        System.out.println("Produsent: ");
        String produsent = scanner.nextLine();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Lansering's år");
        int lansering = scanner.nextInt();
        System.out.println("Sjanger: (ACTION, DRAMA, HISTORY, SCIFI) ");
        Sjanger sjanger = Sjanger.valueOf(scanner.next().toUpperCase(Locale.ROOT));
        System.out.println("FilmSelskap: ");
        String filmSelskap = scanner.nextLine();
        return new Film(filmnr, produsent, title, lansering, sjanger, filmSelskap);
    }

    // vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void visFilm(Film film) {
        System.out.println(film);
    }

    // Skrive ut alle Filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {

        // TODO
    }

    // Skriver ut alle Filmer av en produsent / en gruppe
    public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
        // TODO
    }

    // Skrive ut en enkel statistikk som inneholder antall Filmer totalt
    // og hvor mange det er i hver sjanger
    public void skrivUtStatistikk(FilmarkivADT filma) {
        // TODO
    }
    // ... Ev. andre metoder
}
