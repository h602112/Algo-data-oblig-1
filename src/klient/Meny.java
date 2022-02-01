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
                Film film = new Film(filmnr, produsent, title, lansering, sjanger, filmSelskap);
                filmer[index] = film;
                index++;
            }
        }

    }
}
