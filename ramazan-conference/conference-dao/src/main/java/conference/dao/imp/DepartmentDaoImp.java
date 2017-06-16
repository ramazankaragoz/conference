package conference.dao.imp;

import conference.dao.core.BaseDAO;
import conference.dao.interfaces.IDepartmentDao;
import conference.entities.imp.DepartmentImp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Repository
public class DepartmentDaoImp extends BaseDAO<Long,DepartmentImp> implements IDepartmentDao<DepartmentImp> {


    @Override
    public DepartmentImp getById(Long id) {
        return getByID(id);
    }

    @Override
    public Boolean createEntity(DepartmentImp departmentImp) {
        return create(departmentImp);
    }

    @Override
    public Boolean deleteEntity(DepartmentImp departmentImp) {
        return delete(departmentImp);
    }

    @Override
    public Boolean updateEntity(DepartmentImp departmentImp) {
        return update(departmentImp);
    }

    @Override
    public List<DepartmentImp> getList() {
        return list();
    }


}
