package mvp.presenter;

import Code.Rayon;
import mvp.model.DAO;
import mvp.model.SpecialRayon;
import mvp.view.ViewInterface;

public class RayonPresenter extends Presenter<Rayon> implements SpecialRayonPresenter {
    public RayonPresenter(DAO<Rayon> model, ViewInterface<Rayon> view) {
        super(model, view);
    }

    @Override
    public void listerExemplaires(Rayon r){
        view.affList(((SpecialRayon)model).listerExemplaires(r));
    }

}
