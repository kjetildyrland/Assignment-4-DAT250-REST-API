package de.vogella.jpa.simple.DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    List<T> read();

    T read(int id);

    void create(T t);

    void update(T t);

    void delete(int id);
}
