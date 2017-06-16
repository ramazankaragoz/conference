package conference.dao.core;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Component
public abstract class BaseDAO<ID extends Serializable,T>  {

    private final Class<T> entityClass;

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public BaseDAO(){
        this.entityClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }



    protected Session getSession() {

        return sessionFactory.getCurrentSession();

    }

    protected Criteria createEntityCriteria() {
        return getSession().createCriteria(this.entityClass);
    }

    public T getByID(ID id) {
        try {

            T result = (T) getSession().get(entityClass, id);

            return result;
        } catch (HibernateException e) {

            return null;
        }
    }

    public Boolean create(T entity) {
        try {

            getSession().persist(entity);

            return true;
        } catch (HibernateException e) {

            return false;
        }
    }

    public Boolean update(T entity) {
        try {

            getSession().update(entity);

            return true;
        } catch (HibernateException e) {

            return false;
        }
    }

    public Boolean delete(T entity) {
        try {

            getSession().delete(entity);

            return true;
        } catch (HibernateException e) {

            return false;
        }
    }

    public List<T> list() {
        try {

            @SuppressWarnings("unchecked")
            List<T> list = this.createEntityCriteria().list();

            return list;
        } catch (HibernateException e) {

            return null;
        }
    }

}