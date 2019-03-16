package common;

import java.util.List;

public interface BaseDao<T> {
    public List<T> findAll();
    public int insert(T t);
    public int update (T t,int id);
    public int delete(int id);
    public T findById(int id);
}