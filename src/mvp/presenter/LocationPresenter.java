package mvp.presenter;

import Code.Location;
import mvp.model.DAO;
import mvp.view.ViewInterface;

public class LocationPresenter  extends Presenter<Location> {
    public LocationPresenter(DAO<Location> model, ViewInterface<Location> view) {
        super(model,view);
    }

}
