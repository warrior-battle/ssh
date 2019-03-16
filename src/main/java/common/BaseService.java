package common;

import java.util.List;

public interface BaseService <T>{
    public List<T> findAll();
    public boolean insert(T t);
    public boolean update (T t,int id);
    public boolean delete(int id);
    public T findById(int id);
}