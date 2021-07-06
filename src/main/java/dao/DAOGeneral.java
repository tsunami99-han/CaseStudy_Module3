package dao;

import java.util.List;

public interface DAOGeneral<T> {
    List<T> findAll();

    T findById(int id);

    List<T> findByName(String name);

    void add(T t);

    void edit(int id, T t);

    void delete(int id);
}
