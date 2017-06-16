package conference.interfaces;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
public interface IDepartmentService <T> {

    public T getById(Long id);

    public Boolean create(T t);

    public Boolean delete(T t);

    public Boolean update(T t);

    public List<T> getList();
}
