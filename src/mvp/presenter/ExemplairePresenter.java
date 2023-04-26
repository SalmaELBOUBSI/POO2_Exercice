package mvp.presenter;

import Code.Exemplaire;
import mvp.model.DAO;
import mvp.view.ViewInterface;

public class ExemplairePresenter extends Presenter<Exemplaire> {
    public ExemplairePresenter(DAO<Exemplaire> model, ViewInterface<Exemplaire> view) {
        super(model,view);
    }

}
