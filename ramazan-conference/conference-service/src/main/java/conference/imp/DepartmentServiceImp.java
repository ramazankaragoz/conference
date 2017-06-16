package conference.imp;

import conference.dao.interfaces.IDepartmentDao;
import conference.entities.imp.DepartmentImp;
import conference.interfaces.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Service
@Transactional
public class DepartmentServiceImp implements IDepartmentService<DepartmentImp> {

    @Autowired
    private IDepartmentDao departmentDao;

    @Override
    public DepartmentImp getById(Long id) {
        return (DepartmentImp) departmentDao.getById(id);
    }

    @Override
    public Boolean create(DepartmentImp departmentImp) {
        return departmentDao.createEntity(departmentImp);
    }

    @Override
    public Boolean delete(DepartmentImp departmentImp) {
        return departmentDao.deleteEntity(departmentImp);
    }

    @Override
    public Boolean update(DepartmentImp departmentImp) {
        return departmentDao.updateEntity(departmentImp);
    }

    @Override
    public List<DepartmentImp> getList() {
        return departmentDao.getList();
    }
}
