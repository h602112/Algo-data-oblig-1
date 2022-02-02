package klient;
import java.util.Locale;
import java.util.Scanner;
import adt.FilmarkivADT;
import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

    public class Meny {
        private Tekstgrensesnitt tekstgr;
        private FilmarkivADT filmarkiv;

        public Meny(FilmarkivADT filmarkiv){
            tekstgr = new Tekstgrensesnitt();
            this.filmarkiv = filmarkiv;
        }

        public void start(){
            // legg inn en del forhåndsdefinerte filmer
            // TODO
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many movies do you want to input?");
            int numberOfMovies = scanner.nextInt();
            Film[] filmer = new Film[numberOfMovies];
            int index = 0;
            while (index < numberOfMovies) {
                Film film = tekstgr.lesFilm();
                filmer[index] = film;
                index++;
            }

    }
}
