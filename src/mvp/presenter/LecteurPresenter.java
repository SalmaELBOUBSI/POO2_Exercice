package mvp.presenter;

import Code.Exemplaire;
import Code.Lecteur;
import mvp.model.DAO;
import mvp.model.DAOLecteur;
import mvp.model.SpecialLecteur;
import mvp.view.LecteurViewInterface;
import mvp.view.ViewInterface;

import java.util.List;

public class LecteurPresenter extends Presenter<Lecteur>  {
    public LecteurPresenter(DAO<Lecteur> model, ViewInterface<Lecteur> view) {
        super(model,view);
    }


    public void exemplairesEnLocation(Lecteur l) {
        List<Exemplaire> lex =   ((SpecialLecteur)model).exemplairesEnLocation(l);
        if(lex==null || lex.isEmpty()) view.affMsg("aucun exemplaire trouvé");
        else view.affList(lex);
    }
    public void exemplairesLoues(Lecteur l) {
        List<Exemplaire> lex =   ((SpecialLecteur)model).exemplairesLoues(l);
        if(lex==null || lex.isEmpty()) view.affMsg("aucun exemplaire trouvé");
        else view.affList(lex);
    }
}
