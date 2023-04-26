package mvp.view;

import mvp.presenter.Presenter;

import java.util.List;

public interface ViewInterface<L> {
    <T> void setPresenter(Presenter<T> tPresenter);

    <T> void setListDatas(List<T> all);

    void affMsg(String s);
}
