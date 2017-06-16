package conference.imp;

import conference.dao.interfaces.IEmployeeDao;
import conference.entities.imp.EmployeeImp;
import conference.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService<EmployeeImp> {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public EmployeeImp getById(Long id) {
        return (EmployeeImp) employeeDao.getById(id);
    }

    @Override
    public Boolean create(EmployeeImp employeeImp) {
        return employeeDao.createEntity(employeeImp);
    }

    @Override
    public Boolean delete(EmployeeImp employeeImp) {
        return employeeDao.deleteEntity(employeeImp);
    }

    @Override
    public Boolean update(EmployeeImp employeeImp) {
        return employeeDao.updateEntity(employeeImp);
    }

    @Override
    public List<EmployeeImp> getList() {
        return employeeDao.getList();
    }
}
