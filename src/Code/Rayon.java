package Code;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Rayon {
    private String codeRayon;
    private String genre;
    private List<Exemplaire> lex = new ArrayList<>();

    public Rayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }


    public Rayon(String codeRayon, String genre) throws Exception {
        if(codeRayon==null|| codeRayon.trim().equals("")) throw new Exception("code rayon vide");
        if(genre==null|| genre.trim().equals("")) throw new Exception("code rayon vide");
        this.codeRayon = codeRayon;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rayon rayon = (Rayon) o;
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
    public void addExemplaire(Exemplaire e){
        e.setRayon(this);
    }

    public void remove(Exemplaire e){
        lex.remove(e);
        e.setRayon(null);
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

    public List<Exemplaire> getLex() {
        return lex;
    }

    public void setLex(List<Exemplaire> lex) {
        this.lex = lex;
    }

    public List<Exemplaire>listerExemplaires(){
        return lex;
    }

}
