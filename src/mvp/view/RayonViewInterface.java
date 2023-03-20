package mvp.view;

import Code.Rayon;
import mvp.presenter.RayonPresenter;

import java.util.List;

public interface RayonViewInterface {
    public void setPresenter(RayonPresenter presenter);

    public void setListDatas(List<Rayon> rayons);

    public void affMsg(String msg);
}
