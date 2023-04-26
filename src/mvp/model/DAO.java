package mvp.model;

import java.util.List;

public interface DAO<T> {
    T add(T element);

    boolean remove(T element);

    T update(T element);

    T read(T element);

    List<T> getAll();
}
