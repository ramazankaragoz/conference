package conference.dao.imp;

import conference.dao.core.BaseDAO;
import conference.dao.interfaces.IEmployeeDao;
import conference.entities.imp.EmployeeImp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Repository
public class EmployeeDaoImp extends BaseDAO<Long,EmployeeImp> implements IEmployeeDao<EmployeeImp>{


    @Override
    public EmployeeImp getById(Long id) {
        return getByID(id);
    }

    @Override
    public Boolean createEntity(EmployeeImp employeeImp) {
        return create(employeeImp);
    }

    @Override
    public Boolean deleteEntity(EmployeeImp employeeImp) {
        return delete(employeeImp);
    }

    @Override
    public Boolean updateEntity(EmployeeImp employeeImp) {
        return update(employeeImp);
    }

    @Override
    public List<EmployeeImp> getList() {
        return list();
    }
}
