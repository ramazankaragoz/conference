package conference.dao.interfaces;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 15.06.2017.
 */
public interface IMeetingDao <T>{

    public T getById(Long id);

    public Boolean createEntity(T t);

    public Boolean deleteEntity(T t);

    public Boolean updateEntity(T t);

    public List<T> getList();
}
