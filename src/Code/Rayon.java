package Code;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rayon {
    private String codeRayon;
    private String genre;

    List<Exemplaire> listerExemplaires = new ArrayList<>();

    public Rayon(String codeRayon, String genre) {
        this.codeRayon = codeRayon;
        this.genre = genre;
    }

    public Rayon(String codeRayon, String genre, List<Exemplaire> listerExemplaires) {
        this.codeRayon = codeRayon;
        this.genre = genre;
        this.listerExemplaires = listerExemplaires;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Exemplaire> getListerExemplaires() {
        return listerExemplaires;
    }

    public void setListerExemplaires(List<Exemplaire> listerExemplaires) {
        this.listerExemplaires = listerExemplaires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rayon rayon)) return false;
        return Objects.equals(codeRayon, rayon.codeRayon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRayon);
    }

    @Override
    public String toString() {
        return "Rayon{" +
                "codeRayon='" + codeRayon + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
