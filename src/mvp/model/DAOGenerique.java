package mvp.model;

import java.util.List;

public interface DAOGenerique<T> {
    T add(T element);

    boolean remove(T element);

    T update(T element);

    T read(T element);

    List<T> getAll();
}
