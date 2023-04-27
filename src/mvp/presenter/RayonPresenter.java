package mvp.presenter;

import Code.Rayon;
import mvp.model.DAO;
import mvp.model.DAORayon;
import mvp.view.RayonViewInterface;

import java.util.List;

public class RayonPresenter {
    private DAORayon model;
    private RayonViewInterface view;

    public RayonPresenter(DAO<Rayon> model, RayonViewInterface view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start() {
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }

    public void addRayon(Rayon rayon) {
        Rayon ray = model.addRayon(rayon);
        if(ray!=null) view.affMsg("création de :"+ray);
        else view.affMsg("erreur de création");
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }


    public void removeRayon(Rayon rayon) {
        boolean ok = model.removeRayon(rayon);
        if(ok) view.affMsg("Rayon effacé");
        else view.affMsg("Rayon non effacé");
        List<Rayon> rayons = model.getRayons();
        view.setListDatas(rayons);
    }

}
