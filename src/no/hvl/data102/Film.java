package no.hvl.data102;

public class Film {
    private int filmnr;
    private String produsent;
    private String title;
    private int lansering;
    private Sjanger sjanger;
    private String filmSelskap;

    public Film(){

    }

    public Film(int filmnr, String produsent, String title, int lansering, Sjanger sjanger, String filmSelskap) {
        this.filmnr = filmnr;
        this.produsent = produsent;
        this.title = title;
        this.lansering = lansering;
        this.sjanger = sjanger;
        this.filmSelskap = filmSelskap;
    }

    public int getFilmnr() {
        return filmnr;
    }

    public void setFilmnr(int filmnr) {
        this.filmnr = filmnr;
    }

    public String getProdusent() {
        return produsent;
    }

    public void setProdusent(String produsent) {
        this.produsent = produsent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLansering() {
        return lansering;
    }

    public void setLansering(int lansering) {
        this.lansering = lansering;
    }

    public Sjanger getSjanger() {
        return sjanger;
    }

    public void setSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }

    public String getFilmSelskap() {
        return filmSelskap;
    }

    public void setFilmSelskap(String filmSelskap) {
        this.filmSelskap = filmSelskap;
    }


    public boolean equals(Film film) {
        return film.getFilmnr() == this.filmnr;
    }

    public int hashCode() {
        Integer temp = filmnr;
        return temp.hashCode();
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmnr=" + filmnr +
                ", produsent='" + produsent + '\'' +
                ", title='" + title + '\'' +
                ", lansering=" + lansering +
                ", sjanger=" + sjanger +
                ", filmSelskap='" + filmSelskap + '\'' +
                '}';
    }
}
