package mvp.presenter;

import Code.Rayon;
import mvp.model.DAO;
import mvp.model.DAORayon;
import mvp.view.RayonViewInterface;
import mvp.view.ViewInterface;

import java.util.List;

public class RayonPresenter extends Presenter<Rayon>{
    public RayonPresenter(DAO<Rayon> model, ViewInterface<Rayon> view) {
        super(model, view);
    }


}
