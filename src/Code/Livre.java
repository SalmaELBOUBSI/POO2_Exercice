package Code;

import java.time.LocalDate;
import java.util.Objects;

public class Livre extends Ouvrage {
    private String isbn;
    private int nombrePages;
    private String TypeLivre;
    private String resume;

    public Livre(String titre, byte ageMin, LocalDate dateParution, String typeOuvrage, Double prixLocation, String langue, String genre, String isbn, int nombrePages, String typeLivre, String resume) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombrePages = nombrePages;
        TypeLivre = typeLivre;
        this.resume = resume;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public String getTypeLivre() {
        return TypeLivre;
    }

    public void setTypeLivre(String typeLivre) {
        TypeLivre = typeLivre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livre livre)) return false;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
